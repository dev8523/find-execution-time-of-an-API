# find-execution-time-of-an-API

You can use this implementation to find time duration to complete the execution of an API from the start to end
persisting all records and then fetching in same implementation.

# Dependencies used:

Spring Data Jpa, Spring Web

# Test API locally:

You can run the app without packaging it using:

```bash
mvn spring-boot:run
```

# URI:

```bash
POST http://localhost:8080/saveAndRetrieve
```

# Request Payload Sample:

```json
[
  {
    "age": 24,
    "firstName": "Debasish",
    "lastName": "Sahoo"
  },
  {
    "age": 20,
    "firstName": "Harry",
    "lastName": "Potter"
  }
]
```

# Response Payload Sample:

```json
[
  "Time Elapsed in milli second = 5 ms",
  [
    {
      "age": 20,
      "firstName": "Harry",
      "lastName": "Potter"
    },
    {
      "age": 24,
      "firstName": "Debasish",
      "lastName": "Sahoo"
    },
    {
      "age": 31,
      "firstName": "FGH",
      "lastName": "FFG"
    },
    {
      "age": 33,
      "firstName": "FGH",
      "lastName": "FFG"
    },
    {
      "age": 34,
      "firstName": "FGH",
      "lastName": "FFG"
    },
    {
      "age": 44,
      "firstName": "FGH",
      "lastName": "FFG"
    }
  ]
]
```
