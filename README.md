# CustQ
An industry-agnostic queue management solution for all customers.

- Project Overview:
  The project focuses on handling the basic problem of managing the queue for any place making it easy for the operations while facilitating the end user in an effective transparent way.
  
- Workflow:
  1) Admin:
     ![image](https://github.com/Ksc55/CustQ/assets/6066608/0f7f7e07-f855-4238-8a50-3c45f2fcfc4f)
  2) End User:
     ![image](https://github.com/Ksc55/CustQ/assets/6066608/f15b3916-ac3c-44e6-9d3f-bea81e2ce7d1)

- Prototype:
  Admin User
  https://www.figma.com/proto/vGPLdoHfcZiml5dux6U5Kk/KSC55-Devpost-Hackathon?page-id=0%3A1&type=design&node-id=10-660&viewport=948%2C528%2C0.18&t=SGytJwyqZmNKBl16-1&scaling=scale-down&starting-point-node-id=29%3A3583&show-proto-sidebar=1&mode=design

  End User:
  https://www.figma.com/proto/AlWZgt8Z62Y8iRRWRqdUlw/Untitled?page-id=0%3A1&type=design&node-id=1-4561&viewport=29%2C66%2C0.12&t=wurl3rJ3vNvzwzcP-1&scaling=scale-down&starting-point-node-id=1%3A4561&mode=design
  
- Demonstration video of the project:
  https://github.com/Ksc55/CustQ/assets/94205435/93d1a35a-8b9f-4e03-a02b-439f14e7c784
  
- Technologies Used:
    -  Backend:    Java with Spring Boot
    -  Frontend:   ReactJS
    -  Mobile:     Native Android Application
    -  Design:     Figma
    -  Chatbot:    Python with Flask
      
- Architectural Diagram:
![image](https://github.com/Ksc55/CustQ/assets/6066608/32df61a9-c69b-4f63-b86b-07adb93f0c5b)

![image](https://github.com/Ksc55/CustQ/assets/6066608/cdba6f6e-d234-4736-8e4d-1bf1540535d8)
    
- How to deploy this project:
  1) Backend:
  - Create an Openshift account
  - Click on "Add: and select Database
  - Select PostgreSQL and click on "Instantiate Template"
  - Add the following details in username and password: postgres
  - Run the sqlscripts.sql from backend/db folder
  - Click on "Add" and select "Git Repository" Option
  - Enter the following URL in Git Repo URL - [https://github.com/Ksc55/CustQ/tree/main/](https://github.com/Ksc55/CustQ.git)
  - Open advanced Git options and enter "backend" in Context dir without quotes
  - Select Import Strategy as Builder Image and select Java as the builder image
  - Add the environment variables :
        - SQL_URL: jdbc:postgresql://postgresql:5432/sampledb
        - SQL_USER: postgres
        - SQL_PASSWORD: postgres
  - Submit this and wait for the build and deployment to complete.

  2) Frontend:
  - Click on "Add" and select "Git Repository" Option
  - Enter the following URL in Git Repo URL - [https://github.com/Ksc55/CustQ/tree/main/](https://github.com/Ksc55/CustQ.git)
  - Open advanced Git options and enter "client" in Context dir without quotes
  - Select Import Strategy as Builder Image and select Javascript as the builder image.
  - Submit this and wait for the build and deployment to complete.
  
- Demo screens:
  1) End User Screens:
    - SPLASH SCREEN
      ![超级截屏_20231110_203100](https://github.com/Ksc55/CustQ/assets/94205435/00def03d-e9b4-41fc-a00c-30c459ea93b2)
      
    - LOGIN SCREEN
      ![超级截屏_20231110_203110](https://github.com/Ksc55/CustQ/assets/94205435/b5e709c1-aaab-4a39-ae97-1111f7e3383b)
      
    - OTP CONFIRMATION SCREEN
      ![超级截屏_20231110_203121](https://github.com/Ksc55/CustQ/assets/94205435/c69222c6-2f3e-41d8-b963-5d9554cb0e29)
      
    - DASHBOARD SCREEN
      ![超级截屏_20231110_203133](https://github.com/Ksc55/CustQ/assets/94205435/b982e3b2-8841-4af9-a1c5-568774f94a53)
      
    - QUEUE STATUS SCREEN
      ![超级截屏_20231110_203155](https://github.com/Ksc55/CustQ/assets/94205435/a11a51c2-2cf8-4684-90f8-bb8dcfba6141)
      
    - ACTIVE QUEUE SCREEN
      ![超级截屏_20231110_203225](https://github.com/Ksc55/CustQ/assets/94205435/29c594f5-dce1-4fb3-b7e1-bd6ca8a18cf6)
      
    - JOIN QUEUE ALERT DIALOG
      ![超级截屏_20231106_164109](https://github.com/Ksc55/CustQ/assets/94205435/f3ffabe5-8604-4474-90c8-67d7e6d12d1b)

    - JOIN ACTIVE QUEUE SCREEN INDICATOR ALERT DIALOG
      ![超级截屏_20231110_203214](https://github.com/Ksc55/CustQ/assets/94205435/20cbab9d-49c4-4572-aa20-43bd0ade3fd0)

    - VIEW MORE SCREEN
      ![超级截屏_20231110_203205](https://github.com/Ksc55/CustQ/assets/94205435/70367a7f-c416-4445-8b80-6640bf5c56be)

    - EXIT QUEUE CONFIRMATION SCREEN
    ![超级截屏_20231110_203236](https://github.com/Ksc55/CustQ/assets/94205435/47822998-4d6b-4334-9b4e-0eced3bcb928)

    - RATE SERVICE SCREEN
    ![超级截屏_20231110_203255](https://github.com/Ksc55/CustQ/assets/94205435/ad28aac4-4831-4ebc-9065-b475da41ed89)

    - SUBMITTED RATE DETAILS INDICATOR ALERT DIALOG
    ![超级截屏_20231110_203303](https://github.com/Ksc55/CustQ/assets/94205435/5b2b9b72-fa7e-4c22-b697-2ca15afed29b)



  
