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
    nombreCompleto: data.nombreCompleto,
    cargo: data.cargo,
    salario: parseFloat(data.salario),
    tipoContrato: parseInt(data.tipoContrato, 10) ,
    telefono: data.telefono,
    direccion: data.direccion
  })
    .then(function (response) {
      console.log('response',response);
    })
    .catch(function (error) {
      console.log(error);
    });
 }
    

  const handleForm=(data)=>{
    console.log('desdeApp',data);
    setdataAdmin(...dataAdmin,data)
    post(data)
  }

  const eliminar=(id)=>{
    console.log("eliminar",id);
    axios.delete(url + `/delete/${id}`)
        .then(() => {alert(id,'eliminado correctamente')});
  }

  return (
    <>
      <div className='main-container'>
        <div className='container-data'>
          <h1>Datos</h1>
          <ul>
            {dataAdmin.map(dato => (
              
              <Card direccion={dato.direccion} cargo={dato.cargo} id={dato.id} eliminar={eliminar} nombre={dato.nombreCompleto} />
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
