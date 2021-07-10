# find-execution-time-of-an-API
You can use this implementation to find time duration to complete the execution of an API from the start to end persisting all records and then fetching in same implementation.

# Dependencies used:
Spring Data Jpa, Spring Web

# Request Payload Sample:
``[
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
]``

# Response Payload Sample:
`[
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
]`
