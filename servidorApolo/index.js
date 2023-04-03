const fetch = require("node-fetch");
const { ApolloServer, gql } = require("apollo-server");

const typeDefs = gql`
type Rocket {
  rocket_id: String
  rocket_name: String
  rocket_type: String
}
  
   type Estudiante{
    _id:String
    seudonimo:String
      nombre: String!
      
  }
  type Query {
    estudiantes: [Estudiante]
    rockets: [Rocket]
  }
`;

const resolvers = {
  Query: {
    estudiantes:() => fetchEstudiantes(),
    rockets:() => fetchRockets(),
  }
};

const server = new ApolloServer({ typeDefs, resolvers });

server.listen().then(({ url }) => {
  console.log(`🚀  Servidor listo ${url}`);
});


function fetchEstudiantes() {
 
  return fetch("http://localhost:8080/usuarios")
    .then(res => res.json());
}

function fetchRockets() {
  return fetch("https://api.spacexdata.com/v3/rockets")
    .then(res => res.json());
}



