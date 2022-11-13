package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;

public class MainSceneController implements Initializable{

	@FXML
    private Button AccionClasificar;
	
	@FXML
    private TextArea area1;

    @FXML
    private ComboBox<Previotic> at1;

    @FXML
    private ComboBox<Previotic> at10;

    @FXML
    private ComboBox<Previotic> at11;

    @FXML
    private ComboBox<Previotic> at12;

    @FXML
    private ComboBox<Previotic> at13;

    @FXML
    private ComboBox<Previotic> at14;

    @FXML
    private ComboBox<Previotic> at15;

    @FXML
    private ComboBox<Previotic> at16;

    @FXML
    private ComboBox<Previotic> at17;

    @FXML
    private ComboBox<Previotic> at18;

    @FXML
    private ComboBox<Previotic> at19;

    @FXML
    private ComboBox<Previotic> at2;

    @FXML
    private ComboBox<Previotic> at20;

    @FXML
    private ComboBox<Previotic> at21;

    @FXML
    private ComboBox<Previotic> at22;

    @FXML
    private ComboBox<Previotic> at23;

    @FXML
    private ComboBox<Previotic> at24;

    @FXML
    private ComboBox<Previotic> at25;

    @FXML
    private ComboBox<Previotic> at26;

    @FXML
    private ComboBox<Previotic> at27;

    @FXML
    private ComboBox<Previotic> at28;

    @FXML
    private ComboBox<Previotic> at3;

    @FXML
    private ComboBox<Previotic> at4;

    @FXML
    private ComboBox<Previotic> at5;

    @FXML
    private ComboBox<Previotic> at6;

    @FXML
    private ComboBox<Previotic> at7;

    @FXML
    private ComboBox<Previotic> at9;

    @FXML
    private TextField prd0;

    @FXML
    private TextField prd1;

    @FXML
    private TextField pro0;

    @FXML
    private TextField pro1;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		//previotic[] items0 = {new previotic("Aguascalientes",1), new previotic("Aguascalientes",2)};
		
		at1.getItems().addAll(estates());
		at1.setConverter(new PrevioticConverter());
		at1.getSelectionModel().selectFirst();
		
		at2.getItems().addAll(municipios(1));
		at2.setConverter(new PrevioticConverter());
		at2.getSelectionModel().selectFirst();
		
		at3.getItems().addAll(localidad(1,1));
		at3.setConverter(new PrevioticConverter());
		at3.getSelectionModel().selectFirst();
		
		at4.getItems().addAll(tamaños());
		at4.setConverter(new PrevioticConverter());
		at4.getSelectionModel().selectFirst();
		
		at5.getItems().addAll(estates());
		at5.setConverter(new PrevioticConverter());
		at5.getSelectionModel().selectFirst();
		
		at6.getItems().addAll(municipios(1));
		at6.setConverter(new PrevioticConverter());
		at6.getSelectionModel().selectFirst();
		
		at7.getItems().addAll(tamaños());
		at7.setConverter(new PrevioticConverter());
		at7.getSelectionModel().selectFirst();
		
		at9.getItems().addAll(sexo());
		at9.setConverter(new PrevioticConverter());
		at9.getSelectionModel().selectFirst();
		
		at10.getItems().addAll(edadm());
		at10.setConverter(new PrevioticConverter());
		at10.getSelectionModel().selectFirst();
		
		at11.getItems().addAll(edadh());
		at11.setConverter(new PrevioticConverter());
		at11.getSelectionModel().selectFirst();
		
		at12.getItems().addAll(dia());
		at12.setConverter(new PrevioticConverter());
		at12.getSelectionModel().selectFirst();
		
		at13.getItems().addAll(mes());
		at13.setConverter(new PrevioticConverter());
		at13.getSelectionModel().selectFirst();
		
		at14.getItems().addAll(año());
		at14.setConverter(new PrevioticConverter());
		at14.getSelectionModel().selectFirst();
		
		at15.getItems().addAll(tnacimiento());
		at15.setConverter(new PrevioticConverter());
		at15.getSelectionModel().selectFirst();
		
		at16.getItems().addAll(ordenparto());
		at16.setConverter(new PrevioticConverter());
		at16.getSelectionModel().selectFirst();
		
		at17.getItems().addAll(lugarparto());
		at17.setConverter(new PrevioticConverter());
		at17.getSelectionModel().selectFirst();
		
		at18.getItems().addAll(quienatendio());
		at18.setConverter(new PrevioticConverter());
		at18.getSelectionModel().selectFirst();
		
		at19.getItems().addAll(hijosvivos());
		at19.setConverter(new PrevioticConverter());
		at19.getSelectionModel().selectFirst();
		
		at20.getItems().addAll(hijossuper());
		at20.setConverter(new PrevioticConverter());
		at20.getSelectionModel().selectFirst();
		
		at21.getItems().addAll(edocivil());
		at21.setConverter(new PrevioticConverter());
		at21.getSelectionModel().selectFirst();
		
		at22.getItems().addAll(escolaridad());
		at22.setConverter(new PrevioticConverter());
		at22.getSelectionModel().selectFirst();
		
		at23.getItems().addAll(escolaridad());
		at23.setConverter(new PrevioticConverter());
		at23.getSelectionModel().selectFirst();
		
		at24.getItems().addAll(trabajo());
		at24.setConverter(new PrevioticConverter());
		at24.getSelectionModel().selectFirst();
		
		at25.getItems().addAll(trabajo());
		at25.setConverter(new PrevioticConverter());
		at25.getSelectionModel().selectFirst();
		
		at26.getItems().addAll(notrabajo());
		at26.setConverter(new PrevioticConverter());
		at26.getSelectionModel().selectFirst();
		
		at27.getItems().addAll(notrabajo());
		at27.setConverter(new PrevioticConverter());
		at27.getSelectionModel().selectFirst();
		
		at28.getItems().addAll(hora());
		at28.setConverter(new PrevioticConverter());
		at28.getSelectionModel().selectFirst();
		
		at1.setOnAction(event ->{
			llenar(at1.getSelectionModel().getSelectedItem().getValue());
			llenar1(at2.getSelectionModel().getSelectedItem().getValue(), at1.getSelectionModel().getSelectedItem().getValue());
		});
		
		at2.setOnAction(event ->{
			llenar1(at2.getSelectionModel().getSelectedItem().getValue(), at1.getSelectionModel().getSelectedItem().getValue());
		});
		
		at5.setOnAction(event ->{
			llenarb(at5.getSelectionModel().getSelectedItem().getValue());
		});
	}
	
	private ArrayList<Previotic> estates(){
		ArrayList<Previotic> items0 = new ArrayList<>();
		
		try {
			
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/datosNacimientos", "postgres", "*******");
			ResultSet res = con.createStatement().executeQuery("select nom_loc, cve_ent from catemlna21 where cve_mun='0' and cve_loc='0'");
			while(res.next()) {
				items0.add(new Previotic(res.getString("nom_loc"),res.getInt("cve_ent")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return items0;
	}
	
	private ArrayList<Previotic> tamaños(){
		ArrayList<Previotic> items0 = new ArrayList<>();
	
		items0.add(new Previotic("De 1 a 999 habitantes",1));
		items0.add(new Previotic("De 1000 a 1999 habitantes",2));
		items0.add(new Previotic("De 2000 a 2499 habitantes",3));
		items0.add(new Previotic("De 2500 a 4999 habitantes",4));
		items0.add(new Previotic("De 5000 a 9999 habitantes",5));
		items0.add(new Previotic("De 10000 a 14999 habitantes",6));
		items0.add(new Previotic("De 15000 a 19999 habitantes",7));
		items0.add(new Previotic("De 20000 a 29999 habitantes",8));
		items0.add(new Previotic("De 30000 a 39999 habitantes",9));
		items0.add(new Previotic("De 40000 a 49999 habitantes",10));
		items0.add(new Previotic("De 50000 a 74999 habitantes",11));
		items0.add(new Previotic("De 75000 a 99999 habitantes",12));
		items0.add(new Previotic("De 100000 a 249999 habitantes",13));
		items0.add(new Previotic("De 250000 a 499999 habitantes",14));
		items0.add(new Previotic("De 500000 a 999999 habitantes",15));
		items0.add(new Previotic("De 1000000 a 1499999 habitantes",16));
		items0.add(new Previotic("De 1500000 y más habitantes",17));
		items0.add(new Previotic("No especificado",99));
			
		return items0;
	}
	
	private ArrayList<Previotic> sexo(){
		ArrayList<Previotic> items0 = new ArrayList<>();
	
		items0.add(new Previotic("Hombre",1));
		items0.add(new Previotic("Mujer",2));
		items0.add(new Previotic("No especificado",9));
			
		return items0;
	}
	
	private ArrayList<Previotic> edadm(){
		ArrayList<Previotic> items0 = new ArrayList<>();
		
		int i=10;
		while(i<51) {
			items0.add(new Previotic((i+" años"),i));
			i++;
		}
		items0.add(new Previotic("No especificado",99));
			
		return items0;
	}

	private ArrayList<Previotic> edadh(){
		ArrayList<Previotic> items0 = new ArrayList<>();
		
		int i=12;
		while(i<99) {
			items0.add(new Previotic((i+" años"),i));
			i++;
		}
		items0.add(new Previotic("No especificado",99));
			
		return items0;
	}
	
	private ArrayList<Previotic> dia(){
		ArrayList<Previotic> items0 = new ArrayList<>();
		
		int i=1;
		while(i<32) {
			items0.add(new Previotic(i+"",i));
			i++;
		}
		items0.add(new Previotic("No especificado",99));
			
		return items0;
	}

	private ArrayList<Previotic> mes(){
		ArrayList<Previotic> items0 = new ArrayList<>();
		
		items0.add(new Previotic("Enero",1));
		items0.add(new Previotic("Febrero",2));
		items0.add(new Previotic("Marzo",3));
		items0.add(new Previotic("Abril",4));
		items0.add(new Previotic("Mayo",5));
		items0.add(new Previotic("Junio",6));
		items0.add(new Previotic("Julio",7));
		items0.add(new Previotic("Agosto",8));
		items0.add(new Previotic("Septiembre",9));
		items0.add(new Previotic("Octubre",10));
		items0.add(new Previotic("Noviembre",11));
		items0.add(new Previotic("Diciembre",12));
		items0.add(new Previotic("No especificado",9));
			
		return items0;
	}
	
	private ArrayList<Previotic> año(){
		ArrayList<Previotic> items0 = new ArrayList<>();
		
		int i=1901;
		while(i<2022) {
			items0.add(new Previotic(i+"",i));
			i++;
		}
		items0.add(new Previotic("No especificado",9999));
			
		return items0;
	}
	
	private ArrayList<Previotic> tnacimiento(){
		ArrayList<Previotic> items0 = new ArrayList<>();
		
		items0.add(new Previotic("Simple",1));
		items0.add(new Previotic("Doble",2));
		items0.add(new Previotic("Triple o más",3));
		items0.add(new Previotic("No especificado",9));
			
		return items0;
	}
	
	private ArrayList<Previotic> ordenparto(){
		ArrayList<Previotic> items0 = new ArrayList<>();
		
		items0.add(new Previotic("1° Orden del parto",1));
		items0.add(new Previotic("2° Orden del parto",2));
		items0.add(new Previotic("3° Orden del parto",3));
		items0.add(new Previotic("4° Orden del parto",4));
		items0.add(new Previotic("5° Orden del parto",5));
		items0.add(new Previotic("6° Orden del parto",6));
		items0.add(new Previotic("7° Orden del parto",7));
		items0.add(new Previotic("8° Orden del parto",8));
		items0.add(new Previotic("9° Orden del parto",9));
		items0.add(new Previotic("10° Orden del parto",10));
		items0.add(new Previotic("No especificado",99));
			
		return items0;
	}

	private ArrayList<Previotic> lugarparto(){
		ArrayList<Previotic> items0 = new ArrayList<>();
		
		items0.add(new Previotic("Hospital o clínica oficial",1));
		items0.add(new Previotic("Hospital o clínica privada",2));
		items0.add(new Previotic("En su domicilio",3));
		items0.add(new Previotic("Otro",4));
		items0.add(new Previotic("No especificado",9));
			
		return items0;
	}
	
	private ArrayList<Previotic> quienatendio(){
		ArrayList<Previotic> items0 = new ArrayList<>();
		
		items0.add(new Previotic("Médico",1));
		items0.add(new Previotic("Enfermera",2));
		items0.add(new Previotic("Partera",3));
		items0.add(new Previotic("Otro",4));
		items0.add(new Previotic("No especificado",9));
			
		return items0;
	}
	
	private ArrayList<Previotic> hijosvivos(){
		ArrayList<Previotic> items0 = new ArrayList<>();
		
		int i=1;
		while(i<26) {
			items0.add(new Previotic(i+"",i));
			i++;
		}
		items0.add(new Previotic("No especificado",99));
			
		return items0;
	}
	
	private ArrayList<Previotic> hijossuper(){
		ArrayList<Previotic> items0 = new ArrayList<>();
		
		int i=1;
		while(i<26) {
			items0.add(new Previotic(i+"",i));
			i++;
		}
		items0.add(new Previotic("No especificado",99));
			
		return items0;
	}
	
	private ArrayList<Previotic> edocivil(){
		ArrayList<Previotic> items0 = new ArrayList<>();
		
		items0.add(new Previotic("Soltera",1));
		items0.add(new Previotic("Casada",2));
		items0.add(new Previotic("Unión libre",3));
		items0.add(new Previotic("Separada",4));
		items0.add(new Previotic("Divorciada",5));
		items0.add(new Previotic("Viuda",6));
		items0.add(new Previotic("No especificado",9));
			
		return items0;
	}

	private ArrayList<Previotic> escolaridad(){
		ArrayList<Previotic> items0 = new ArrayList<>();
		
		items0.add(new Previotic("Sin escolaridad",1));
		items0.add(new Previotic("De 1 a 3 años de primaria",2));
		items0.add(new Previotic("De 4 a 5 años de primaria",3));
		items0.add(new Previotic("Primaria completa",4));
		items0.add(new Previotic("Secundaria o equivalente",5));
		items0.add(new Previotic("Preparatoria o equivalente",6));
		items0.add(new Previotic("Profesional",7));
		items0.add(new Previotic("Otra",8));
		items0.add(new Previotic("No especificado",9));
			
		return items0;
	}
	
	private ArrayList<Previotic> trabajo(){
		ArrayList<Previotic> items0 = new ArrayList<>();
		
		items0.add(new Previotic("Trabaja",1));
		items0.add(new Previotic("No trabaja",2));
		items0.add(new Previotic("No especificado",9));
			
		return items0;
	}

	private ArrayList<Previotic> notrabajo(){
		ArrayList<Previotic> items0 = new ArrayList<>();
		
		items0.add(new Previotic("Tiene trabajo o está buscando",1));
		items0.add(new Previotic("Estudiante",2));
		items0.add(new Previotic("Dedicado a quehaceres del hogar",3));
		items0.add(new Previotic("Jubilado o pensionado",4));
		items0.add(new Previotic("Incapacitado permanente para trabajar",5));
		items0.add(new Previotic("Otra",6));
		items0.add(new Previotic("No especificado",9));
			
		return items0;
	}
	
	private ArrayList<Previotic> hora(){
		ArrayList<Previotic> items0 = new ArrayList<>();
		
		int i=0;
		while(i<24) {
			items0.add(new Previotic(i+" horas",i));
			i++;
		}
		items0.add(new Previotic("No especificado",99));
			
		return items0;
	}
	
	private ArrayList<Previotic> municipios(int entidad){
		ArrayList<Previotic> items0 = new ArrayList<>();
		
		try {
			
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/datosNacimientos", "postgres", "******");
			ResultSet res = con.createStatement().executeQuery("select nom_loc,cve_mun from catemlna21 where cve_loc='0' and cve_mun!='0' and cve_ent='"+entidad+"'");
			while(res.next()) {
				items0.add(new Previotic(res.getString("nom_loc")+" "+res.getInt("cve_mun"),res.getInt("cve_mun")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return items0;
	}
	
	private ArrayList<Previotic> localidad(int municipio, int entidad){
		ArrayList<Previotic> items0 = new ArrayList<>();
		
		try {
			
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/datosNacimientos", "postgres", "******");
			ResultSet res = con.createStatement().executeQuery("select nom_loc,cve_loc from catemlna21 where cve_loc!='0' and cve_mun='"+municipio+"' and cve_ent='"+entidad+"'");
			while(res.next()) {
				items0.add(new Previotic(res.getString("nom_loc")+" "+res.getInt("cve_loc"),res.getInt("cve_loc")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return items0;
	}
    
    void llenar(int entidad) {
    	/*
    	at2.getItems().clear();
		String[] items1 = {"a","b","c"};
		at2.getItems().addAll(items1);
		at2.getSelectionModel().selectFirst();*/
    	at2.getItems().clear();
    	at2.getItems().addAll(municipios(entidad));
		at2.setConverter(new PrevioticConverter());
		at2.getSelectionModel().selectFirst();
		
	}
    void llenar1(int municipio, int entidad) {
    	/*
    	at2.getItems().clear();
		String[] items1 = {"a","b","c"};
		at2.getItems().addAll(items1);
		at2.getSelectionModel().selectFirst();*/
    	at3.getItems().clear();
    	at3.getItems().addAll(localidad(municipio,entidad));
		at3.setConverter(new PrevioticConverter());
		at3.getSelectionModel().selectFirst();
		
	}
    void llenarb(int entidad) {
    	/*
    	at2.getItems().clear();
		String[] items1 = {"a","b","c"};
		at2.getItems().addAll(items1);
		at2.getSelectionModel().selectFirst();*/
    	at6.getItems().clear();
    	at6.getItems().addAll(municipios(entidad));
		at6.setConverter(new PrevioticConverter());
		at6.getSelectionModel().selectFirst();
		
	}
	
	@FXML
    void calcular(ActionEvent event) {
		int n1=at1.getSelectionModel().getSelectedItem().getValue();
		int n2=at2.getSelectionModel().getSelectedItem().getValue();
		int n3=at3.getSelectionModel().getSelectedItem().getValue();
		int n4=at4.getSelectionModel().getSelectedItem().getValue();
		int n5=at5.getSelectionModel().getSelectedItem().getValue();
		int n6=at6.getSelectionModel().getSelectedItem().getValue();
		int n7=at7.getSelectionModel().getSelectedItem().getValue();
		int n9=at9.getSelectionModel().getSelectedItem().getValue();
		int n10=at10.getSelectionModel().getSelectedItem().getValue();
		int n11=at11.getSelectionModel().getSelectedItem().getValue();
		int n12=at12.getSelectionModel().getSelectedItem().getValue();
		int n13=at13.getSelectionModel().getSelectedItem().getValue();
		int n14=at14.getSelectionModel().getSelectedItem().getValue();
		int n15=at15.getSelectionModel().getSelectedItem().getValue();
		int n16=at16.getSelectionModel().getSelectedItem().getValue();
		int n17=at17.getSelectionModel().getSelectedItem().getValue();
		int n18=at18.getSelectionModel().getSelectedItem().getValue();
		int n19=at19.getSelectionModel().getSelectedItem().getValue();
		int n20=at20.getSelectionModel().getSelectedItem().getValue();
		int n21=at21.getSelectionModel().getSelectedItem().getValue();
		int n22=at22.getSelectionModel().getSelectedItem().getValue();
		int n23=at23.getSelectionModel().getSelectedItem().getValue();
		int n24=at24.getSelectionModel().getSelectedItem().getValue();
		int n25=at25.getSelectionModel().getSelectedItem().getValue();
		int n26=at26.getSelectionModel().getSelectedItem().getValue();
		int n27=at27.getSelectionModel().getSelectedItem().getValue();
		int n28=at28.getSelectionModel().getSelectedItem().getValue();
		
		/*double n5=Double.parseDouble(atr4.getText());
		double n6=Double.parseDouble(atr5.getText());
		double n7=Double.parseDouble(atr6.getText());
		double n8=Double.parseDouble(atr7.getText());*/
		String[]a= Principal.week(n1,n2,n3,n4,n5,n6,n7,n9,n10,n11,n12,n13,n14,n15,n16,n17,n18,n19,n20,n21,n22,n23,n24,n25,n26,n27,n28);
		prd0.setText(a[0]+"");
		prd1.setText(a[2]+"");
		pro0.setText(a[1]+"");
		pro1.setText(a[3]+"");
		area1.setText(n1+","+n2+","+n3+","+n4+","+n5+","+n6+","+n7+","+n9+","+n10+","+n11+","+n12+","+n13+","+n14
				+","+n15+","+n16+","+n17+","+n18+","+n19+","+n20+","+n21+","+n22+","+n23+","+n24+","+n25+","+n26+","+n27+",?,"+n28);
	}
	

}
