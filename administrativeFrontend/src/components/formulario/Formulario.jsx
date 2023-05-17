import React, { useState } from 'react'


const Formulario = ({ onSubmit }) => {

    const [data, setData] = useState({
        id: '',
        nombreCompleto: '',
        cargo: '',
        salario: '',
        tipoContrato: '',
        telefono: '',
        direccion: ''
    })

    const handleInput = (event) => {
        const nameInput = event.target.name;
        setData({
            ...data,
            [nameInput]: event.target.value,
        })
    }

    const handleClick = () => {
        onSubmit(data)
    }
    return (
        <>
            <form action="post" >
                <h2>INGRESAR</h2>
                <div className="container-item">

                    <label htmlFor="" >Nombre Completo</label>
                    <input type="text" name='nombreCompleto' onChange={handleInput} />
                </div>
                <div className="container-item">

                    <label htmlFor="" >Cargo</label>
                    <input type="text" name='cargo' onChange={handleInput} />
                </div>
                <div className="container-item">

                    <label htmlFor="" >Licitación por venta</label>
                    <input type="text" name='salario' onChange={handleInput} />
                </div>
                <div className="container-item">

                    <label htmlFor="" >Tipo contrato</label>
                    <input type="text" name='tipoContrato' onChange={handleInput} />
                </div>
                <div className="container-item">

                    <label htmlFor="" >Telefono</label>
                    <input type="text" name='telefono' onChange={handleInput} />
                </div>
                <div className="container-item">

                    <label htmlFor="" >Punto de Venta</label>
                    <input type="text" name='direccion' onChange={handleInput} />
                </div>
                <div className="container-item">

                    <input type="submit" className='buttonForm' value="ENVIAR" onClick={handleClick} />
                </div>

            </form>
        </>
    )
}

export default Formulario
