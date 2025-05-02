package com.gevernova.exceptionhandling;


public class ComparingDifferentExceptions {
    public static void main(String[] args) throws Exception {
        int[] array={1,2,3,4};
        try { //One Try statement can be used for multiple catch statement
            a(array);
        }
        catch (ArrayIndexOutOfBoundsException e){
            StackTraceElement[] st=e.getStackTrace();
            for(int i=0;i< st.length;i++){
                System.out.println(st[i]);
            }
            throw new ArrayIndexOutOfBoundsException("Array index of bound exception");
        }
        catch (StringIndexOutOfBoundsException e){
            StackTraceElement[] st=e.getStackTrace();
            for(int i=0;i< st.length;i++){
                System.out.println(st[i]);
            }
            throw new ArrayIndexOutOfBoundsException("String index of bound exception");
        }
        catch (NullPointerException | ArithmeticException e){

        }
        catch (RuntimeException e) {throw new RuntimeException(e);
        }
        catch (Exception e){
            throw new Exception(e);
        }


    }
    static void a(int a[]){
        b(a);
    }
    static void b(int a[]){
        c(a);
    }
    static void c(int a[]){
        System.out.println(a[a.length]);
    }

}
