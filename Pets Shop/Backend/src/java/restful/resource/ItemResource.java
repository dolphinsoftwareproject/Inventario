package restful.resource;

import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import restful.model.ItemModel;
import restful.service.ItemService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;

@Path("items")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ItemResource {
    
    ItemService servicio = new ItemService();

    @GET
    public ArrayList<ItemModel> getItems() {

        return servicio.getItems();
    }
    
     @Path("/{ItemCodigo}")
    @GET
    public ItemModel getItem(@PathParam("ItemCodigo")String codigo) {

        return servicio.getItem(codigo);
    
    }
    
    @POST
    public ItemModel addItem(String JSON){
       GsonBuilder builder = new GsonBuilder();
       builder.setPrettyPrinting();
       Gson gson = builder.create();
       
       ItemModel item = gson.fromJson(JSON, ItemModel.class);
       return servicio.addItem(item);
    }
    
    @PUT
    public ItemModel updateItem(String JSON){
       GsonBuilder builder = new GsonBuilder();
       builder.setPrettyPrinting();
       Gson gson = builder.create();
       
       ItemModel item = gson.fromJson(JSON, ItemModel.class);
       return servicio.updateItem(item);
    
    }
    
    @DELETE
    @Path("/{ItemCodigo}")
    
    public String deleteItem(@PathParam("ItemCodigo")String codigo){            
       
       return servicio.delItem(codigo);
    
    }
}
    