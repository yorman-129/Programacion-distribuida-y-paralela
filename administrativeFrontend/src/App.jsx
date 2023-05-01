import { useState, useEffect } from 'react'
import './App.css'
import axios from 'axios';
import Card from './components/card/Card';
import Formulario from './components/formulario/Formulario';


function App() {

  const [dataAdmin, setdataAdmin] = useState([])
  const [newData, setNewData]=useState([])
  const url = 'http://localhost:4444/administrative';

  useEffect(() => {
    axios.get(url + '/findAll')
      .then(res => {
        setdataAdmin(res.data);
      });

  }, []);

 const post=(data)=>{
  axios.post(url + '/save', {
    id: data.id,
    nombreCompleto: data.nombreCompleto,
    cargo: data.cargo,
    salario: data.salario,
    tipoContrato: data.tipoContrato,
    telefono: data.telefono,
    direccion: data.direccion
  })
    .then(function (response) {
      console.log(response);
    })
 }
    

  const handleForm=(data)=>{
    console.log('desdeApp',data);
    post(data)
  }

  return (
    <>
      <div className='main-container'>
        <div className='container-data'>
          <h1>Mis datos:</h1>
          <ul>
            {dataAdmin.map(dato => (
              <Card direccion={dato.direccion} cargo={dato.cargo} id={dato.id} nombre={dato.nombreCompleto} />
            ))}
          </ul>
        </div>
        <div className='container-form'>
          <Formulario onSubmit={handleForm}/>
        </div>
      </div>
    </>
  )
}

export default App
