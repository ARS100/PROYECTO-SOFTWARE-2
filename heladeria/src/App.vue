<template>


  <div id="app">
    <div class="border border-dark" style="border: 2px solid grey;background-color: #EABA19 "> 
      <div >
        <div class = "row mb-3 " style = "background-color: #04AA6D">
          <div class="col-sm-2" style="border: 2px solid grey;">
            <div class="border border-dark" style="border: 2px solid grey" >
              <div class="dropdown">
                <div > 
                  <button class="dropbtn">OPCIONES</button>
                
                  <div class="dropdown-content">
                    <a href="#">Link 1</a>
                    <a href="#">Link 2</a>
                    <a href="#">Link 3</a>
                  </div>
                  </div>
              </div>
            </div>
        </div>
      
        
          <div class = "col-sm-10 ; border border-dark" style="text-align: center;border: 2px solid grey">
                <h1 class="titular"> ICE-CREAM </h1>
          </div>

        </div>
        
        <div class="row; border border-dark" >
          <center> 
          <div >
            
              <img class = "foto1" src="heladosymalteadas.jpg" width="1500px" height="270px"  >
          </div>

           
            <div>
            <button >Helados</button>
            
          </div>
          <div >
            
              <img class = "foto2" src="malteadas.jpg" width="1500px" height="270px">
          </div>
           
            <div>
            <button >Malteadas</button>
          </div>
          </center>
        </div>
       

      </div>
    </div>
      
    
  </div>
</template>



<script></script>
<style>
.titular{

font-family: 'Times New Roman';
font-size: 400%;

color:#002303;

}


.biv{
  
  border-top-width: 10px;
  border-right-width: 1em;
  border-bottom-width: thick;
  border-left-width: thin;

}
.dropbtn {
  background-color: #04AA6D;
  color: white;
  padding: 16px;
  font-size: 16px;
  border: none;
}

/* The container <div> - needed to position the dropdown content */
.dropdown {
  position: relative;
  display: inline-block;
}

/* Dropdown Content (Hidden by Default) */
.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f1f1f1;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

/* Links inside the dropdown */
.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

div {
   border-top-width: 10px;
  border-right-width: 1em;
  border-bottom-width: thick;
  border-left-width: thin;
}

/* Change color of dropdown links on hover */
.dropdown-content a:hover {background-color: #ddd;}

/* Show the dropdown menu on hover */
.dropdown:hover .dropdown-content {display: block;}

/* Change the background color of the dropdown button when the dropdown content is shown */
.dropdown:hover .dropbtn {background-color: #3e8e41;}
</style>
