package co.mision.tic.apirestciclo4.Model;

public class ProductModel {

    private String nombreProducto;
    private String cantidad;
    private int precio;
    private String ubicacionProducto;
    
    public ProductModel() {
    }

    public ProductModel(String nombreProducto, String cantidad, int precio, String ubicacionProducto) {
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.ubicacionProducto = ubicacionProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getUbicacionProducto() {
        return ubicacionProducto;
    }

    public void setUbicacionProducto(String ubicacionProducto) {
        this.ubicacionProducto = ubicacionProducto;
    }

    @Override
    public String toString() {
        return "ProductModel [cantidad=" + cantidad + ", nombreProducto=" + nombreProducto + ", precio=" + precio
                + ", ubicacionProducto=" + ubicacionProducto + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cantidad == null) ? 0 : cantidad.hashCode());
        result = prime * result + ((nombreProducto == null) ? 0 : nombreProducto.hashCode());
        result = prime * result + precio;
        result = prime * result + ((ubicacionProducto == null) ? 0 : ubicacionProducto.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProductModel other = (ProductModel) obj;
        if (cantidad == null) {
            if (other.cantidad != null)
                return false;
        } else if (!cantidad.equals(other.cantidad))
            return false;
        if (nombreProducto == null) {
            if (other.nombreProducto != null)
                return false;
        } else if (!nombreProducto.equals(other.nombreProducto))
            return false;
        if (precio != other.precio)
            return false;
        if (ubicacionProducto == null) {
            if (other.ubicacionProducto != null)
                return false;
        } else if (!ubicacionProducto.equals(other.ubicacionProducto))
            return false;
        return true;
    }

    

    

    

    
}
