package DPP.DependencyInjectionExample;

public class CustomerRepositoryImpl implements CustomerRepository {


    @Override
    public String findCustomerById(int id) {

        if (id == 1) {

            return "Customer Found: John Smith";
        }

        return "Customer Not Found";
    }
}
