In .graphql, we've defined the main Query which will return "pets" as an array of Pet types

mutation {
  createPet(input: {name: "namrata", age: "23"}){id}
}

