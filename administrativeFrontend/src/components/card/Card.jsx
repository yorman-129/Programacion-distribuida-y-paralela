import React from 'react'

const Card = ({ nombre, id, direccion, cargo, eliminar }) => {
const eliminarCard=()=>{
  eliminar(id)
}
  return (

    <>
      <li key={id}>
        <p>
          <strong>
            Identificación:
          </strong> {id}

        </p>
        <p>
          <strong>
          Nombre:
          </strong> {nombre}

        </p>
        <p>
          <strong>
          Cargo:
          </strong> {cargo}

        </p>
        <p>
          <strong>
          Punto de Venta:
          </strong> {direccion}

        </p>
        <button onClick={eliminarCard}>eliminar</button>
      </li>
    </>
  )
}

export default Card
