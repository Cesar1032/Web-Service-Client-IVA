package co.edu.iniminuto.ivaclient.bean;

import co.edu.uniminuto.ivaclient.ws.soap.ConsumoIva;
import co.edu.uniminuto.ivaclient.ws.soap.WsIva;
import java.net.URL;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author cgordilg
 */
@ViewScoped
@ManagedBean(name = "operacion")
public class OperacionMB {

    private double valorUno;
    private double valorDos;
    private double sumatoria;
    private String productoUno;
    private String productoDos;
    private String rta;
    private static final String WSDL = "http://localhost:8080/WsIva-war/consumoIva?wsdl";

    public double getValorUno() {
        return valorUno;
    }

    public void setValorUno(double valorUno) {
        this.valorUno = valorUno;
    }

    public double getValorDos() {
        return valorDos;
    }

    public void setValorDos(double valorDos) {
        this.valorDos = valorDos;
    }

    public String getProductoUno() {
        return productoUno;
    }

    public void setProductoUno(String productoUno) {
        this.productoUno = productoUno;
    }

    public String getProductoDos() {
        return productoDos;
    }

    public void setProductoDos(String productoDos) {
        this.productoDos = productoDos;
    }

    public String getRta() {
        return rta;
    }

    public void setRta(String rta) {
        this.rta = rta;
    }

    public double getSumatoria() {
        return sumatoria;
    }

    public void setSumatoria(double sumatoria) {
        this.sumatoria = sumatoria;
    }   
    
    
    public void sumarValores() throws Exception 
    {
        sumatoria= valorUno + valorDos;
    }

    public void consumirIva() throws Exception 
    {
        sumarValores();
        URL wsdl = new URL(WSDL);
        ConsumoIva service = new ConsumoIva(wsdl);
        WsIva port = service.getWsIvaPort();
        rta = String.valueOf(port.consumirIva(sumatoria));
    }

}
