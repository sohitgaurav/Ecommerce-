# Ecommerce-
ecommerce application based on mapping

## Framework and language used
* Springboot
* java

## dependency used
 * dev
 * web
 * lombok
 * my sql  server driver
 * jpa
 * spring boot starter data jpa 

## Data Flow

### Model
* user
   *  Long id
   *  String  Name
   *  string email
   *  String phoneno

* Product
   * Integer productId;
   * String productName;
   * Integer productPrice;
   * String productDescription;
   * String productCategory;
   * String productBrand;

* Address
  * Integer addressId;
  *  String addressName;
  *  String addressLandMark;
  *  String addressPhoneNo;
  *  String addressState;
  *  String zipcode;

* Order
    *   Long orderId;
    *  Integer productCountNumber;
    *   @ManyToOne
    *   User orderUser;
     * @ManyToOne
    *  Address orderAddress;
    *  @ManyToOne
    *  Product orderProduct;

### AddressController
* @PostMapping 
    * employ
*  @GetMapping  
   *  get AddressById 
    
    
### ProductCOntroller
   * @PostMapping 
   * @GetMapping
   * @DeletMapping
   
###  UserController
    * @PostMapping
    * @GetMapping
    
### OrderController
 *  @PostMapping
 *  @GetMapping




### UserService
   * save
   * getUserByID

### Product service
   * save
   * findByProductCategory
   * removeProductByProductId
### AddressService
   * save
   * getAddressById
### OrderService
   *  createOrder
   *  fetchOrder

 





### Database used
* my sql  workbench

##  About Project
* this Project is the about information about users and address
