
package co.edu.uniminuto.ivaclient.ws.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consumirIva complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consumirIva">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valorProducto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consumirIva", propOrder = {
    "valorProducto"
})
public class ConsumirIva {

    protected double valorProducto;

    /**
     * Obtiene el valor de la propiedad valorProducto.
     * 
     */
    public double getValorProducto() {
        return valorProducto;
    }

    /**
     * Define el valor de la propiedad valorProducto.
     * 
     */
    public void setValorProducto(double value) {
        this.valorProducto = value;
    }

}
