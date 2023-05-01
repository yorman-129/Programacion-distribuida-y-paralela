import React, { useState } from 'react'

/*"id": 22431,
        "nombreCompleto": "milton",
        "cargo": "rector",
        "salario": 100.0,
        "tipoContrato": 142,
        "telefono": "666444",
        "direccion": "oooooo" */
const Formulario = ({onSubmit}) => {

    const [data, setData]=useState({
        id: '',
        nombreCompleto: '',
        cargo: '',
        salario: '',
        tipoContrato: '',
        telefono: '',
        direccion: '' 
    })

    const handleInput=(event)=>{
        const nameInput= event.target.name;
        setData({
            ...data,
            [nameInput]: event.target.value,
        })
    }

    const handleform=(event)=>{
        event.preventDefault();
        console.log(data)
        onSubmit(data)
    }
    return (
        <>
            <form action="post" onChange={handleform}>

                <label htmlFor="" >Id</label>
                <input type="text" name='id' onChange={handleInput} />

                <label htmlFor="" >Nombre Completo</label>
                <input type="text" name='nombreCompleto' onChange={handleInput} />

                <label htmlFor="" >Cargo</label>
                <input type="text" name='cargo' onChange={handleInput} />

                <label htmlFor="" >Salario</label>
                <input type="text" name='salario' onChange={handleInput} />

                <label htmlFor="" >Tipo contrato</label>
                <input type="text" name='tipoContrato' onChange={handleInput} />

                <label htmlFor="" >Telefono</label>
                <input type="text" name='telefono' onChange={handleInput} />

                <label htmlFor="" >Direccion</label>
                <input type="text" name='direccion' onChange={handleInput} />

                <input type="submit" value="ENVIAR" />

            </form>
        </>
    )
}

export default Formulario
