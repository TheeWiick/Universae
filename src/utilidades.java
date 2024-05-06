
import java.awt.Dimension;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Wick
 */
    public class utilidades {
            public static void SetImageLabel(JLabel labelName, String root){
            ImageIcon image = new ImageIcon(root);
            Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_SMOOTH));
            labelName.setIcon(icon);
            labelName.repaint();
        }
        
            public static void SetImageLabel(JLabel labelName, String root, Dimension dimension){
            ImageIcon image = new ImageIcon(root);
            Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth()+ dimension.width, labelName.getHeight()+ dimension.height, Image.SCALE_SMOOTH));
            labelName.setIcon(icon);
            labelName.repaint();
        }

    private static final String JSON_FILE_PATH = "src/basedatos.json";

    private static String LeerJSON() throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(JSON_FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        }       catch (IOException ex) {
                    return "Error al leer el archivo JSON";
                }

        return sb.toString();
    }

    public static String NombreGrado(int indexGrado) throws FileNotFoundException, IOException {
        try {
            JSONObject grado = new JSONObject (LeerJSON()).getJSONArray("grados").getJSONObject(indexGrado);

            return grado.getString("grado");
        } catch (JSONException e) {

            return "Error al leer el archivo JSON";
            }
        }
    public static String NombreSimulador(int indexGrado, int NombreSimulador) throws FileNotFoundException, IOException {
        try {
            JSONObject grado = new JSONObject (LeerJSON()).getJSONArray("grados").getJSONObject(indexGrado).getJSONArray("simuladores").getJSONObject(NombreSimulador);

            return grado.getString("titulo");
        } catch (JSONException e) {

            return "Error al leer el archivo JSON";
            }
        }
    
    public static String ImagenSimulador(int indexGrado, int indexSimulador) throws FileNotFoundException, IOException {
        try {
            JSONObject simulador = new JSONObject (LeerJSON()).getJSONArray("grados").getJSONObject(indexGrado).getJSONArray("simuladores").getJSONObject(indexSimulador);

            return simulador.getString("imagen");
        } catch (JSONException e) {

            return "Error al leer el archivo JSON";
            }
        }
    public static String DescripcionSimulador(int indexGrado, int indexSimulador) throws FileNotFoundException, IOException {
        try {
            JSONObject simulador = new JSONObject (LeerJSON()).getJSONArray("grados").getJSONObject(indexGrado).getJSONArray("simuladores").getJSONObject(indexSimulador);

            return simulador.getString("descripcion");
        } catch (JSONException e) {

            return "Error al leer el archivo JSON";
            }
        }
    public static String MiniaturaSimulador(int indexGrado, int indexSimulador) throws FileNotFoundException, IOException {
        try {
            JSONObject simulador = new JSONObject (LeerJSON()).getJSONArray("grados").getJSONObject(indexGrado).getJSONArray("simuladores").getJSONObject(indexSimulador);

            return simulador.getString("miniatura");
        } catch (JSONException e) {

            return "Error al leer el archivo JSON";
            }
        }    
}


