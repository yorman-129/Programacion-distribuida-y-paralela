import React from 'react'

const Card = ({nombre,id,direccion,cargo, eliminar}) => {

  return (
    
    <>
      <li key={id}>{nombre}</li>
     <p>{cargo}</p>
     <p>{direccion}</p>
     <p>{id}</p>
     <button onClick={eliminar}>eliminar</button>
    </>
  )
}

export default Card
