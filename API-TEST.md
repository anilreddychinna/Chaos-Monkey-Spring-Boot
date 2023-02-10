# Chaos-Monkey-Spring-Boot
Chaos Monkey for Spring Boot Reference Guide


# Api Documentaion 

# a) Verify the Chaos money is enabled and all configs set to default

Check to make sure sure every assault and watcher is set to false as below.

`
GET http://localhost:8080/actuator/chaosmonkey
Response:
{
   "chaosMonkeyProperties": {
      "enabled": true,
      "togglePrefix": "chaos.monkey"
},
"assaultProperties": {
   "level": 1,
   "latencyRangeStart": 1000,
   "latencyRangeEnd": 3000,
   "latencyActive": false,
   "exceptionsActive": false,
   "exception": {
      "type": null,
      "arguments": null
    },
"killApplicationActive": false,
"memoryActive": false,
"memoryMillisecondsHoldFilledMemory": 90000,
"memoryMillisecondsWaitNextIncrease": 1000,
"memoryFillIncrementFraction": 0.15,
"memoryFillTargetFraction": 0.25,
"runtimeAssaultCronExpression": "OFF"
},
"watcherProperties": {
"controller": false,
"restController": false,
"service": false,
"repository": false,
"component": false,
"restTemplate": false,
"webClient": false,
"actuatorHealth": false
}
}
`
