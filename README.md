# Spring-Boot-Restful-API-for-Contact-Entry-System
This is a spring boot REST API that will enable a client to perform CRUD operations on the contact collection.


# Reach out to me

[<img align="left" alt="LinkedIn" width="22px" src="https://cdn.jsdelivr.net/npm/simple-icons@v3/icons/linkedin.svg" />](https://www.linkedin.com/in/sai-eshwar-reddy-bobbili/)
[<img align="left" alt="Gmail" width="22px" src="https://cdn.jsdelivr.net/npm/simple-icons@v3/icons/gmail.svg" />](<mailto:bobbilisaieshwarreddy@gmail.com>)

<br/>

 # Usage 
Once the application is started,

## To get all the contacts   
- Goto http://localhost:8080/contact/ which return all contacts available.

```
[
    {
        "id": 1,
        "name": {
            "firstName": "Sai Eshwar",
            "middleName": "Reddy",
            "lastName": "Bobbili"
        },
        "address": {
            "street": "Barton",
            "city": "Charlotte",
            "state": "NC",
            "zip": "28262"
        },
        "phones": [
            {
                "number": "12345",
                "type": "personal"
            }
        ],
        "email": "bobbilisaieshwarreddy@gmail.com"
    }
]
```

## To get specific contact   
- Goto http://localhost:8080/contact/{id} which return all the information about the contact.

  Goto: http://localhost:8080/contact/1 you will get contact with id =1 as below
  
  ```
  [
    {
        "id": 1,
        "name": {
            "firstName": "Sai Eshwar",
            "middleName": "Reddy",
            "lastName": "Bobbili"
        },
        "address": {
            "street": "Barton",
            "city": "Charlotte",
            "state": "NC",
            "zip": "28262"
        },
        "phones": [
            {
                "number": "12345",
                "type": "personal"
            }
        ],
        "email": "bobbilisaieshwarreddy@gmail.com"
    }
  ]
  ```
  
## To add or update a new contact   
- Execute the following in [cURL](https://en.wikipedia.org/wiki/CURL)
```
##For update replace POST to PUT
$ curl -i -X POST -H "Content-Type:application/json" -d "{
    "address": {
        "street": "Barton Creek Drive",
        "city": "Charlotte",
        "state": "North Carolina",
        "zip": "28262"
    },
    "name": {
        "first": "Akhilshetty",
        "middle": "",
        "last": "Madhamshetty"
    },
    "phones": [
        {
            "number": "1234567890",
            "type": "work"
        },
        {
            "number": "9876543210",
            "type": "mobile"
        }
    ],
    "email": "akhil@gmail.com"
}" http://localhost:8080/contacts/

```
