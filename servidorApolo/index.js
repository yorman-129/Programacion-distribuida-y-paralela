const fetch = require("node-fetch");
const { ApolloServer, gql } = require("apollo-server");

const typeDefs = gql`
type Rocket {
  rocket_id: String
  rocket_name: String
  rocket_type: String
}
  
   type Administrativo{
    id: Int
    cargo: String
    direccion: String
    nombre_completo: String
    salario: Int
    telefeno: String
    tipo_contrato: Int

      
  }
  type Query {
    administrativo: [Administrativo]
    rockets: [Rocket]
  }
`;

const resolvers = {
  Query: {
    administrativo: () => fetchAdministrativo(),
    rockets: () => fetchRockets(),
  }
};

const server = new ApolloServer({ typeDefs, resolvers });

server.listen().then(({ url }) => {
  console.log(`🚀  Servidor listo ${url}`);
});


function fetchAdministrativo() {

  return fetch("http://localhost:8080/administrative/findAll")
    .then(res => res.json());
}

function fetchRockets() {
  return fetch("https://api.spacexdata.com/v3/rockets")
    .then(res => res.json());
}



