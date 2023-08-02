import java.lang.reflect.*;
class Analyzer
{
public static void main(String gg[])
{
if(gg.length !=1)
{
System.out.println("Usage : Java Analyzer Class_name");
return;
}

try
{
String ClassToAnalyzer = gg[0];
Class c = Class.forName(ClassToAnalyzer);

System.out.println(" Name ( package Name Include ) :" + c.getName());
System.out.println(" Simple Name : " + c.getSimpleName());

Method methods[];
methods  = c.getDeclaredMethods();
System.out.println("Number of Methods :" + methods.length);
Method m;
String methodName;
Class methodReturnType;
Class parameters[];
int e;
int a;
for( e=0; e<methods.length; e++)
{
m = methods[e];
methodName = m.getName();
System.out.println(" Name of Method :" + methodName);
methodReturnType = m.getReturnType();
System.out.println(" Return Type :" + methodReturnType.getName());

parameters = m.getParameterTypes();
System.out.println(" number of Parameter :" + parameters.length);

for(a = 0; a<parameters.length; a++)
{
System.out.printf(" Paramters Number : %d type :  %s\n ", a+1, parameters[a].getName());
}
System.out.println("*************************************************************");
}

Field fields[];
fields = c.getDeclaredFields();
System.out.println(" Number of Fields :" + fields.length);

Field f;
String FieldName;
Class FieldType;
for(int h=0; h < fields.length; h++)
{
f = fields[h];
FieldName = f.getName();
FieldType = f.getType();
System.out.printf(" Field Number %d , Name %s , type : %s\n " , h+1 , FieldName , FieldType.getName());
}

}catch( ClassNotFoundException cnfe)
{
System.out.println(" class :"+ cnfe.getMessage() + " not found");
}
}
}
