package application;
	
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import weka.classifiers.Classifier;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setResizable(false);
			
			primaryStage.setTitle("Proyecto Unidad 3 - AJRD");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

class Principal {

    /**
     * @param args the command line arguments
     */
    public static String[] week(double atr, double atr1, double atr2, double atr3, double atr4, double atr5,
    		double atr6 , double atr7 , double atr8 , double atr9 , double atr10 , double atr11 , double atr12 , double atr13 ,
    		double atr14 , double atr15 , double atr16 , double atr17 , double atr18 , double atr19 , double atr20 , double atr21 ,
    		double atr22 , double atr23 , double atr24 , double atr25 , double atr27) {
    	Classifier clBayes = null, clJ48=null;
        Instances datos;
        Instance porClasificar=null, actual=null;
        BufferedReader oBuffer;
        Reader oLectorAtrib;
        double valorObtenido;
        double[] distProba;
        String resultado;
        int i=0;
        String[] a=new String [6]; 
            try{
                /*Obtener atributos, en este caso del mismo archivo de tuplas
                por clasificar*/
                oLectorAtrib=new InputStreamReader(
                        Main.class.getResourceAsStream(
                                "prue.arff"));
                oBuffer = new BufferedReader(oLectorAtrib);
                datos = new Instances(oBuffer);
                oBuffer.close();
                datos.setClassIndex(datos.numAttributes() - 2);
                
                /*Ya hay dos tuplas en el archivo, crear una más para efectos
                  del ejemplo (información capturada o de otra fuente de datos).
                 Se indica el total de atributos, incluyendo la clase*/
                porClasificar = new DenseInstance(28);
                //Se llenan todos los atributos excepto la clase
                porClasificar.setValue(datos.attribute(0), atr);
                porClasificar.setValue(datos.attribute(1), atr1);
                porClasificar.setValue(datos.attribute(2), atr2);
                porClasificar.setValue(datos.attribute(3), atr3);
                porClasificar.setValue(datos.attribute(4), atr4);
                porClasificar.setValue(datos.attribute(5), atr5);
                porClasificar.setValue(datos.attribute(6), atr6);
                porClasificar.setValue(datos.attribute(7), atr7);
                porClasificar.setValue(datos.attribute(8), atr8);
                porClasificar.setValue(datos.attribute(9), atr9);
                porClasificar.setValue(datos.attribute(10), atr10);
                porClasificar.setValue(datos.attribute(11), atr11);
                porClasificar.setValue(datos.attribute(12), atr12);
                porClasificar.setValue(datos.attribute(13), atr13);
                porClasificar.setValue(datos.attribute(14), atr14);
                porClasificar.setValue(datos.attribute(15), atr15);
                porClasificar.setValue(datos.attribute(16), atr16);
                porClasificar.setValue(datos.attribute(17), atr17);
                porClasificar.setValue(datos.attribute(18), atr18);
                porClasificar.setValue(datos.attribute(19), atr19);
                porClasificar.setValue(datos.attribute(20), atr20);
                porClasificar.setValue(datos.attribute(21), atr21);
                porClasificar.setValue(datos.attribute(22), atr22);
                porClasificar.setValue(datos.attribute(23), atr23);
                porClasificar.setValue(datos.attribute(24), atr24);
                porClasificar.setValue(datos.attribute(25), atr25);
                porClasificar.setValue(datos.attribute(27), atr27);
                datos.add(porClasificar);
                
                //Abrir modelos
                //Para Bayes
                clBayes = (Classifier) weka.core.SerializationHelper.read(
                        Principal.class.getResourceAsStream(
                                "bayesmodel.model"));
                //Para J48
                clJ48 = (Classifier) weka.core.SerializationHelper.read(
                        Principal.class.getResourceAsStream(
                                "J48CrossProy2.model"));
                
                    actual = datos.get(7);
                    //Bayes
                    valorObtenido = clBayes.classifyInstance(actual);
                    resultado = datos.classAttribute().value((int)valorObtenido);
                    distProba = clBayes.distributionForInstance(actual);
                    a[0]=resultado;
                    a[1]=distProba[(int)valorObtenido]+"";
                    //J48
                    valorObtenido = clJ48.classifyInstance(actual);
                    resultado = datos.classAttribute().value((int)valorObtenido);
                    distProba = clJ48.distributionForInstance(actual);
                    a[2]=resultado;
                    a[3]=distProba[(int)valorObtenido]+"";
                
            }catch(Exception e){
                e.printStackTrace();
            }
    		return a;
    }
    
}