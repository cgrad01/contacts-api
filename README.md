# contacts-api

Phonebook that exposes an index api at /contacts, and can receive a post to /contact, which will will create a new contact if it receives a JSON object in the following structure:

    { 
      "name": "some name",
      "address": "123 Main St",
      "number": "555-555-5555"
    }

You can run the app with gradle by running **gradle bootRun**

## todos

Add validation to the post method, and return proper http responses for invalid requests.
