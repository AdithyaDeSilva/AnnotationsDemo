import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author : Adithya De Silva <adithyadesilva00@google.com>
 * @since : 1/19/21
 **/

//@MyAnno(name="Adithya")

public class AppInitializer {
    @Field1(age=40)
    private int age=20;
/*
        for (Field field : fields) {
            for (Field declaredField : declaredFields) {
                field.setInt(declaredField.getInt());
            }
        }*/

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Customer customer=new Customer(1,"Tharanga","Galle");

        final AppInitializer appInitializer = new AppInitializer();
        appInitializer.changeAge();
        //        AppInitializer.class.getDeclaredAnnotations(MyAnno.class).var
/*
        Customer customer = new Customer(1, "Tharanga", "Matara");
        Method[] declaredMethods = customer.getClass().getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.getName().equals("printCustomer")){
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(customer);
                break;
            }
        }

        Field[] declaredFields = customer.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            if (declaredField.getName().equals("id")){
                declaredField.setAccessible(true);
                declaredField.setInt(customer,1022);
            }
        }
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.getName().equals("printCustomer")){
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(customer);
                break;
            }
        }
*/

    }
}
