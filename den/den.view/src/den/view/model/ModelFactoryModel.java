package den.view.model;
import den.view.*;
import den.view.views.*;
import den.*;
import den.domain.*;
import den.domain.ubicacion.*;
import den.domain.pedido.*;
import den.domain.transporte.*;
import den.domain.persona.*;
import den.domain.producto.*;
import den.domain.envio.*;
import den.domain.ruta.*;
import den.ui.*;



public class ModelFactoryModel {

//------------------------------  Singleton ------------------------------------------------

// Clase estatica oculta. Tan solo se instanciara el singleton una vez

   private static class SingletonHolder {
       private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
   }

           // Método para obtener la instancia de nuestra clase

   public static ModelFactoryModel getInstance()  { 
       return SingletonHolder.eINSTANCE;
   }

     private String estado = "NOINICIALIZADO";
     ModelFactory modelFactory = denFactory.eINSTANCE.createModelFactory();

   static String URL = "/test/src/model/model.den";
               
   public ModelFactoryModel() {
        ModelFactory tempModelFactory = modelFactory;
        modelFactory = modelFactory.cargar(URL);
        modelFactory.implementarModelo();
        modelFactory.salvar(URL);
   }

   public ModelFactory getFactoryModel() {
     return modelFactory;
   }
   public void salvar(){
        modelFactory.salvar(URL);
  }

    public void cargar(){
       modelFactory = modelFactory.cargar(URL);
  }
   public UI getTheUI() {
     // TODO Auto-generated method stub
	     return modelFactory.getTheUI();
   }

   public Domain getTheDomain() {
   	// TODO Auto-generated method stub
   	return modelFactory.getTheDomain();
   }
   public void actualizarEstado(String evento) {
	   if(this.estado.equals("NOINICIALIZADO")) {
		   if(evento.equals("iniciar")) {
			   this.estado = "DESACTUALIZADO";
		   }
	   }
	   if(this.estado.equals("ACTUALIZADO")) {
		   if(evento.equals("iniciar")) {
			   this.estado = "DESACTUALIZADO";
		   }
	   }
	   if(this.estado.equals("DESACTUALIZADO")) {
		   if(evento.equals("actualizar")) {
			   this.estado = "ACTUALIZADO";
		   }
	   }
   }

   public String getEstado() {
	   // TODO Auto-generated method stub
	   return estado;
   }

}