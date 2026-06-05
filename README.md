# springboot_jpa_h2db_crud_operation
This repository is for implementing spring boot crud operation using H2 DB and maven

Below are the list of API's implemented as part of springboot jpa and h2db crud operation and the request response paylods.

saveDepartment:
POST: http://localhost:8082/departments

Request Payload:
{
   "departmentName": "MBA",
   "departmentAddress": "MBA BLOCK",
   "departmentCode": "MB100"
}

Response Payload:
{
    "departmentId": 1,
    "departmentName": "MBA",
    "departmentAddress": "MBA BLOCK",
    "departmentCode": "MB100"
}

updateDepartment
PUT: http://localhost:8082/departments/1

Request Payload:
{
   "departmentName": "Btech",
   "departmentAddress": "BTech BLOCK",
   "departmentCode": "BTech300"
}

Response Payload:
{
    "departmentId": 1,
    "departmentName": "Btech",
    "departmentAddress": "BTech BLOCK",
    "departmentCode": "BTech300"
}

fetchDepartmentList:
GET: http://localhost:8082/departments

Request Payload:

{
   "departmentId": "1"
}

Response Payload:
[
    {
        "departmentId": 1,
        "departmentName": "Btech",
        "departmentAddress": "BTech BLOCK",
        "departmentCode": "BTech300"
    }
]


deleteDepartmentById:
DELETE: http://localhost:8082/departments/3 -> Here we are sending the 'departmentId' value in url to delete perticular department record data.

Request Payload: Here we are sending the 'departmentId' value to delete perticular department record data.
Response Payload: Deleted Successfully
