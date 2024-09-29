package martinezdecarvajalandresignaciojava02;

public  class Control extends Exception {
    
    public Control(String s) 
    {
        switch(s) 
        {
            case "int": 
            {
                intNoValido();
                break;
            }

            case "float":
            {
                floatNoValido();
                break;
            }
        }
        
    }
    
    public void intNoValido() 
    {
        System.out.println("ERROR. No has introducido un numero entero");
    }

    private void floatNoValido() 
    {
        System.out.println("ERROR. Debes usar un punto como separador decimal!");
    }
}
