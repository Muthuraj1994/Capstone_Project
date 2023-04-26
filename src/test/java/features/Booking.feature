Feature: Booking Feature





    Scenario Outline: Booking a roundTrip
      Given : User uses the booking.com application as guest user
      And  : User Selects the Flights Section
      And  : User Selects the travel type as "<travelType>"
      And : User selects the cabintype as "<cabinType>"
      And : User enters the travelers Information <Adult> and  and <Child>  age <Age>
      And : Users selects Origin "<Origin>" and Destination "<Destination>"
      And : User select the date and clicks on search button
      Examples:
      | travelType | cabinType | Adult | Child | Age | Origin | Destination |
      | oneway     | ECONOMY   | 4     | 1     | 12  | MAA    | DEL         |

