#include<stdio.h>
#include<string.h>
#include"validation.h"
#include"empDataStructure.h"

int initialize();
void insertIntoFile(struct Employee);
char* InitCap(char*);

int main(){

    int choice = initialize();

    switch (choice){

        case 1:{

            struct Employee employee;

            // Taking Name
            system("clear");
            printf("\n\n\t\t\t\tEnter Full Name!!");
            strcpy(employee.name.fname, fetchFirstName());
            strcpy(employee.name.mname, fetchMiddleName());
            strcpy(employee.name.lname, fetchLastName());

            // Taking Sex
            system("clear");
            printf("\n\n\t\t\t\tEnter Sex(m/f):\n\t\t\t\t");
            strcpy(employee.sex, fetchSex());

            // Taking Address
            system("clear");
            printf("\n\n\t\t\t\tEnter Full Address!!");
            strcpy(employee.address.house_no, fetchHouseNumber());
            strcpy(employee.address.street_name, fetchStreetName());
            strcpy(employee.address.city_name, fetchCityName());

            // Taking pincode
            system("clear");
            printf("\n\n\t\t\t\tEnter Pincode:\n\t\t\t\t");
            strcpy(employee.pincode, fetchPincode());

            //Taking Country
            system("clear");
            printf("\n\n\t\t\t\tEnter Country:\n\t\t\t\t");
            strcpy(employee.country, fetchCountry());

            // Taking email
            system("clear");
            printf("\n\n\t\t\t\tEnter Email:\n\t\t\t\t");
            strcpy(employee.email, fetchEmail());

            //Taking contact
            system("clear");
            printf("\n\n\t\t\t\tEnter Contact Number:\n\t\t\t\t");
            strcpy(employee.contact_no, fetchContactNumber());

          //Taking date of Birth
    /*       system("clear");
           printf("\n\n\t\t\t\tEnter Date Of Birth!!");
           strcpy(employee.dateofbirth.date, fetchDateofBirth());
            strcpy(employee.dateofbirth.month, fetchMonthofBirth());
           strcpy(employee.dateofbirth.year, fetchYearofBirth());*/

            //Taking Occupation
            system("clear");
            printf("\n\n\t\t\t\tEnter Occupation:\n\t\t\t\t");
            strcpy(employee.occupation, fetchOccupation());

            //Taking Designation
            system("clear");
            printf("\n\n\t\t\t\tEnter Designation:\n\t\t\t\t");
            strcpy(employee.designation, fetchDesignation());

            // Taking Date of Joining
         /*   system("clear");
            printf("\n\n\t\t\t\tEnter Date of Joining!!");
            strcpy(employee.dateofjoining.date, fetchDateofJoining());
            strcpy(employee.dateofjoining.month, fetchMonthofJoining());
           strcpy(employee.dateofjoining.year, fetchYearofJoining());*/

            //Taking Basic Salary
            system("clear");
            printf("\n\n\t\t\t\tEnter Basic Salary:\n\t\t\t\t");
            strcpy(employee.basic_salary, fetchBasicSalary());



            insertIntoFile(employee);
            break;
        }

        case 2:{




        }

        case 3:{

            struct Employee employee;
            system("clear");
            printf("\n\n\t\t\t\tEnter Contact Number:\n\t\t\t\t");
            strcpy(employee.contact_no, fetchContactNumber());

            if(findEmployee(employee.contact_no)) printf("Found!!");
            else printf("You are not the Member!!");

        }

        case 4:{




        }


    }


    return 0;
}

int initialize(){

    printf("\n\n\t\t\t\tTo Insert new Employee Data Press 1\n\t\t\t\tTo Modify any Existing Employee Data Press 2\n\t\t\t\tTo Search any Employee data Press 3\n\t\t\t\tTo delete any Employee data Press 4\n\n\t\t\t\t");
    int choice;
    scanf("%d",&choice);
    return choice;
}

void insertIntoFile(struct Employee employee){

    FILE *employee_file;

    employee_file = fopen("employee.txt","a+");

    fprintf(employee_file,"Name: %s %s %s\n",InitCap(employee.name.fname),InitCap(employee.name.mname),InitCap(employee.name.lname));
    fprintf(employee_file,"Sex: %s\n",employee.sex);
    fprintf(employee_file,"Address: %s %s %s\n",employee.address.house_no,employee.address.street_name,employee.address.city_name);
    fprintf(employee_file,"Pincode: %s\n",employee.pincode);
//    fprintf(employee_file,"Country: %s\n",employee.country);
    fprintf(employee_file,"Email: %s\n",employee.email);
    fprintf(employee_file,"Contact: %s\n",employee.contact_no);
    fprintf(employee_file,"DateOfBirth: %s %s %s\n",employee.dateofbirth.date,employee.dateofbirth.month,employee.dateofbirth.year);
    fprintf(employee_file,"Occupation: %s\n",employee.occupation);
    fprintf(employee_file,"Designation: %s\n",employee.designation);
//    fprintf(employee_file,"DateOfJoining: %s %s %s\n",employee.dateofjoining.date,employee.dateofjoining.month,employee.dateofjoining.year);
    fprintf(employee_file,"Basic Salary: %s\n",employee.basic_salary);

    fclose(employee_file);
    system("clear");
    printf("\n\n\t\t\t\tData Sucessfully Saved!!");
    return;
}

char* InitCap(char* data){

    if(data[0]>=97 && data[0]<124){

        data[0] = data[0]-32;
        return data;
    }
    else{

        return data;
    }
}
