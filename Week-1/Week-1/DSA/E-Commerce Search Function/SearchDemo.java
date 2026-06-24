package DSA.E-Commerce Search Function;

public class SearchDemo {

    static int linearSearch(Product[] products,String key){

        for(int i=0;i<products.length;i++){
            if(products[i].productName.equals(key))
                return i;
        }
        return -1;
    }

    static int binarySearch(Product[] products,String key){

        int low=0, high=products.length-1;

        while(low<=high){

            int mid=(low+high)/2;

            int cmp=products[mid].productName.compareTo(key);

            if(cmp==0)
                return mid;
            else if(cmp<0)
                low=mid+1;
            else
                high=mid-1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Product[] p={
                new Product(1,"Apple"),
                new Product(2,"Laptop"),
                new Product(3,"Mobile")
        };

        System.out.println(linearSearch(p,"Laptop"));
        System.out.println(binarySearch(p,"Laptop"));
    }
}
