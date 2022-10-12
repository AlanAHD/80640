function leer(){
    return document.getElementById("todo").value
}

function agregar(){
    nodo= document.createElement("li")
    // texto= document.createTextNode("hola")
    texto= document.createTextNode(leer())
    nodo.appendChild(texto)
    document.getElementById("lista").appendChild(nodo)

}

function buscar(){
    //buscar por id
    // if(document.getElementById(leer()) == null)
    // console.log("No existe")
    // else
    // alert("Ojo! Ya existe")
    listaTodo=document.getElementsByTagName("li")
    for(const element of listaTodo){
        if(element.textContent == leer()){
            console.log("Si Existe", element)
        }else{
            console.log("No existe",element)
        }
    }

}