#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<ctype.h>

char *fetchFirstName(){

    int i=0,error=0;
    char *name;
    name = (char*)calloc(50,sizeof(char));
    printf("\n\n\t\t\t\tEnter your First Name:\n\t\t\t\t");
    scanf("%s",name);

    for(;i<strlen(name);i++){

        if(! isalpha(name[i])){

            error = 1;
            break;
        }
        else error = 0;
    }

    if(error == 1){

       printf("System has encountered an error while saving data!! Please re-enter your first name!!");
       fetchFirstName();
    }
    else {

        return name;
    }
}

char* fetchMiddleName(){

    int i=0,error=0;
    char *name;
    name = (char*)calloc(50,sizeof(char));
    printf("\n\n\t\t\t\tEnter your Middle Name (if not exist press '/'):\n\t\t\t\t");
    scanf("%s",name);

    for(;i<strlen(name);i++){

        if (name[0] == '/'){

            error = 0;
            break;
        }

        if(! isalpha(name[i])){

            error = 1;
            break;
        }
        else error = 0;
    }

    if(error == 1){

       printf("System has encountered an error while saving data!! Please re-enter your middle name!!");
       fetchMiddleName();
    }

    else {
        if(name[0] == '/'){

            return "";
        }
        else return name;
    }
}

char* fetchLastName(){

    int i=0,error=0;
    char *name;
    name = (char*)calloc(50,sizeof(char));
    printf("\n\n\t\t\t\tEnter your Last Name:\n\t\t\t\t");
    scanf("%s",name);

    for(;i<strlen(name);i++){

        if(! isalpha(name[i])){

            error = 1;
            break;
        }
        else error = 0;
    }

    if(error == 1){

       printf("System has encountered an error while saving data!! Please re-enter your Last name!!");
       fetchLastName();
    }
    else return name;
}

char* fetchSex(){

    char *sex;
    sex = (char*)calloc(10,sizeof(char));
    scanf("%s",sex);

    if(strcmp(sex,"m")==0 || strcmp(sex,"M")==0){

        return "Male";
    }
    else if(strcmp(sex,"f")==0 || strcmp(sex,"F")==0){

        return "Female";
    }
    else{
            printf("System has encountered an error in saving the data. Please re-enter your sex!!\n\t\t\t\tEnter Sex(m/f):\n\t\t\t\t");
            fetchSex();
    }
}

char* fetchHouseNumber(){

    int i=0,error=0;
    char *houseNumber;
    houseNumber = (char*)calloc(10,sizeof(char));
    printf("\n\n\t\t\t\tEnter your House Number:\n\t\t\t\t");
    scanf("%s",houseNumber);

    for(;i<strlen(houseNumber);i++){

        if( isdigit(houseNumber[i])){

            error = 0;
        }

        else if( isalpha(houseNumber[i])){

            error =1;
            break;
        }
        else error = 0;
    }

    if(error == 1){

        printf("System has encountered an error in saving the data. Please re-enter your House Number!!");
        fetchHouseNumber();
    }
    else return houseNumber;
}

char *fetchStreetName(){

    int i=0,error=0;
    char *name;
    name = (char*)calloc(50,sizeof(char));
    printf("\n\n\t\t\t\tEnter your Street Name:\n\t\t\t\t");
    scanf("%s",name);

    for(;i<strlen(name);i++){

        if(! isalpha(name[i])){

            error = 1;
            break;
        }
        else error = 0;
    }

    if(error == 1){

       printf("System has encountered an error while saving data!! Please re-enter your Street name!!");
       fetchStreetName();
    }
    else {

        return name;
    }
}

char *fetchCityName(){

    int i=0,error=0;
    char *name;
    name = (char*)calloc(50,sizeof(char));
    printf("\n\n\t\t\t\tEnter your City Name:\n\t\t\t\t");
    scanf("%s",name);

    for(;i<strlen(name);i++){

        if(! isalpha(name[i])){

            error = 1;
            break;
        }
        else error = 0;
    }

    if(error == 1){

       printf("System has encountered an error while saving data!! Please re-enter your City name!!");
       fetchCityName();
    }
    else {

        return name;
    }
}

char* fetchPincode(){

    int i=0,error=0;
    char *pincode;
    pincode = (char*)calloc(10,sizeof(char));
    printf("\n\n\t\t\t\tEnter your Pincode:\n\t\t\t\t");
    scanf("%s",pincode);

    if(strlen(pincode)>6 || strlen(pincode)<6){

        error = 1;
    }
    else{

        for(;i<strlen(pincode);i++){

            if( isdigit(pincode[i])){

                error = 0;
            }

            else if( isalpha(pincode[i])){

                error =1;
                break;
            }
            else error = 0;
        }
    }

    if(error == 1){

        printf("System has encountered an error in saving the data. Please re-enter your Pincode!!");
        fetchPincode();
    }
    else return pincode;
}

char* fetchEmail(){

    char *x;
    x = (char*)calloc(30,sizeof(char));
    scanf("%s",x);
    int count=0;
    int countp=0;
    int i,j;
    int t,t2;
    int k=0;
    char null = 'n';
    for(i=0 ; i<strlen(x) ; i++) 	// finding the index of '@' in email id.
    {
        if(x[i]=='@')
        {
            count++;
            t=i;
        }
    }
    if(count==1)			// work only if count of @ is 1
    {
        if (t == 0){

            k = -1;

        }
        for(j=0; j<t ; j++)
        {
            if((x[j]=='_' || x[j]=='.' || isalpha(x[j]) || isdigit(x[j])))
            {
                k=0;

            }
            else{

                k = -1;
                    break;
            }
        }
        if(k==0)
        {
            for(i=t; i<strlen(x) ; i++)  //  finding the count of '.' in email.
            {
                if(x[i]=='.')
                {
                    t2=i;
                    countp++;
                }
            }
            if(countp==1)		// work only if count of . is 1
            {
                for(i=t2+1; i<strlen(x); i++)
                {
                    if(!(isalpha(x[i])))  // if not alphabet then
                    {

                        k=-1;

                        break;
                    }
                    else
                    {

                        k=1;
                    }
                }
                if(k==1)
                {
                    if((strlen(x)-(t2+1))<=3)	// checking the length after . (cannot be more than 3)
                    {
                        k=0;

                    }
            else k = -1;

                }
            }
            else
            {

                k=-1;

            }
        }
    }
    else
    {

        k=-1;

    }

    if(k == -1){

        printf("System has encountered an error in saving the data. Please re-enter your Email!!");
        fetchEmail();
    }
    else return x;

}

char* fetchContactNumber(){

    int i=0,error=0;
    char *number;
    number = (char*)calloc(10,sizeof(char));
    printf("\n\n\t\t\t\tEnter your Contact Number:\n\t\t\t\t");
    scanf("%s",number);

    if(strlen(number)>10 || strlen(number)<10){

        error = 1;
    }
    else{

        for(;i<strlen(number);i++){

            if( isdigit(number[i])){

                error = 0;
            }

            else if( isalpha(number[i])){

                error =1;
                break;
            }
            else error = 0;
        }
    }

    if(error == 1){

        printf("System has encountered an error in saving the data. Please re-enter your Contact Number!!");
        fetchContactNumber();
    }
    else return number;
}

char* fetchDateofBirth(){

    int i=0,error=0;
    char* date;
    int* dob;
    date = (char*)calloc(10,sizeof(char));
    printf("\n\n\t\t\t\tEnter your Date of Birth (between 1,31):\n\t\t\t\t");
    scanf("%d",&dob);

    if(dob>31 &&dob<1){

        error = 1;
    }
    else{

        date = dob;
        error = 0;
    }

    if(error == 1){

        printf("System has encountered an error in saving the data. Please re-enter your Date of Birth (between 1,31)!!");
        fetchDateofBirth();
    }
    else return date;
}

char* fetchMonthofBirth(){

    int i=0,error=0;
    char *month;
    int mob;
    month = (char*)calloc(10,sizeof(char));
    printf("\n\n\t\t\t\tEnter your Month of Birth (between 1,12):\n\t\t\t\t");
    scanf("%d",&mob);

    if(mob>12 &&mob<1){

        error = 1;
    }
    else{

        month = (char*)mob;
        error = 0;
    }

    if(error == 1){

        printf("System has encountered an error in saving the data. Please re-enter your Month of Birth (between 1,12)!!");
        fetchMonthofBirth();
    }
    else return month;
}

char* fetchYearofBirth(){

    int i=0,error=0;
    char *year;
    int yob;
    year = (char*)calloc(10,sizeof(char));
    printf("\n\n\t\t\t\tEnter your Year of Birth:\n\t\t\t\t");
    scanf("%d",&yob);

    if(yob>2018 &&yob<1900){

        error = 1;
    }
    else{

        year = (char*)yob;
        error = 0;
    }

    if(error == 1){

        printf("System has encountered an error in saving the data. Please re-enter your Year of Birth!!");
        fetchYearofBirth();
    }
    else return year;
}

char *fetchOccupation(){

    int i=0,error=0;
    char *name;
    name = (char*)calloc(50,sizeof(char));
    printf("\n\n\t\t\t\tEnter your Occupation:\n\t\t\t\t");
    scanf("%s",name);

    for(;i<strlen(name);i++){

        if(! isalpha(name[i])){

            error = 1;
            break;
        }
        else error = 0;
    }

    if(error == 1){

       printf("System has encountered an error while saving data!! Please re-enter your Occupation!!");
       fetchOccupation();
    }
    else {

        return name;
    }
}

char *fetchDesignation(){

    int i=0,error=0;
    char *name;
    name = (char*)calloc(50,sizeof(char));
    printf("\n\n\t\t\t\tEnter your Designation:\n\t\t\t\t");
    scanf("%s",name);

    for(;i<strlen(name);i++){

        if(! isalpha(name[i])){

            error = 1;
            break;
        }
        else error = 0;
    }

    if(error == 1){

       printf("System has encountered an error while saving data!! Please re-enter your Designation!!");
       fetchDesignation();
    }
    else {

        return name;
    }
}

char* fetchBasicSalary(){

    int i=0,error=0;
    char *number;
    number = (char*)calloc(10,sizeof(char));
    printf("\n\n\t\t\t\tEnter your Basic Salary in Indian Currency:\n\t\t\t\t");
    scanf("%s",number);

    if(strlen(number)<3){

        error = 1;
    }
    else{

        for(;i<strlen(number);i++){

            if( isdigit(number[i])){

                error = 0;
            }

            else if( isalpha(number[i])){

                error =1;
                break;
            }
            else error = 0;
        }
    }

    if(error == 1){

        printf("System has encountered an error in saving the data. Please re-enter your Contact Number!!");
        fetchBasicSalary();
    }
    else return number;
}

char *fetchCountry(){

    int i=0,error=0;
    char *name;
    name = (char*)calloc(50,sizeof(char));
    printf("\n\n\t\t\t\tEnter your Country Name:\n\t\t\t\t");
    scanf("%s",name);

    for(;i<strlen(name);i++){

        if(! isalpha(name[i])){

            error = 1;
            break;
        }
        else error = 0;
    }

    if(error == 1){

       printf("System has encountered an error while saving data!! Please re-enter your Country name!!");
       fetchCountry();
    }
    else {

        return name;
    }
}

int findEmployee(char* num){

    FILE *employee_file;
    char sentence[2000][1000];
    char concat[] = "Contact: ";
    int i=0;

    employee_file = fopen("employee.txt","r");

    while(fgets(sentence[i++],sizeof(sentence),employee_file)){

        //printf("%s",sentence[i-1]);
        //printf("%s",strcat(concat,num));
        if(strcpy(sentence[i],strcat(concat,num))==0){

            return 1;
        }
    }

    fclose(employee_file);

    return 0;

}
