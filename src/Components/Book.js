import '../Assets/Css/book.css';

const Book=()=>
{
    return(

<div>


<h1>Vehicle Booking Form</h1>

<body className='bodybo'>
    <form className='formbo'>
    <form action="submit_booking.php" method="post">
        <h2 className='h2bo'>Vehicle Booking Form</h2>

        <label for="name">First Name:</label>
        <input type="text" id="name" name="name" required/>
       
        <label for="name">last Name:</label>
        <input type="text" id="name" name="name" required/>

        <label for="email">Age:</label>
        <input type="age" id="age" name="age" required/>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required/>
       
        <label for="phone">Phone:</label>
        <input type="tel" id="phone" name="phone" required/>
        
        <label for="email">From:</label>
        <div class="main-flex-w3ls-sectns">
         <div class="field-agileinfo-spc form-w3-agile-text1">
            <select class="form-control">
               <option>From</option>
               <option value="Lorem Ipsum">Lorem Ipsum</option>
               <option value="Adipiscing">Adipiscing</option>
               <option value="Lorem Ipsum">Lorem Ipsum</option>
               <option value="Adipiscing">Adipiscing</option>
               <option value="Lorem Ipsum">Lorem Ipsum</option>
               <option value="Adipiscing">Adipiscing</option>
            </select>
         </div>

         <label for="email">To:</label>
         <div class="field-agileinfo-spc form-w3-agile-text2">
            <select class="form-control">
               <option>To</option>
               <option value="Lorem Ipsum">Lorem Ipsum</option>
               <option value="Adipiscing">Adipiscing</option>
               <option value="Lorem Ipsum">Lorem Ipsum</option>
               <option value="Adipiscing">Adipiscing</option>
               <option value="Lorem Ipsum">Lorem Ipsum</option>
               <option value="Adipiscing">Adipiscing</option>
            </select>
         </div>
      </div>
      

        <label for="vehicle">Select Vehicle:</label>
        <select id="vehicle" name="vehicle" required>
            <option value="sedan">Sedan Cabs</option>
            <option value="suv">SUV Travels</option>
            <option value="truck">XY Express</option>
        </select>

        <label for="vehicle">Adult Count </label>
        <div class="triple-wthree">
         <div class="field-agileinfo-spc form-w3-agile-text11">
            <select class="form-control">
               <option value="">Adult(12+ Yrs)</option>
               <option value="1">1</option>
               <option value="2">2</option>
               <option value="3">3</option>
               <option value="4">4</option>
               <option value="5">5+</option>
            </select>
         </div>
         </div>

        <label for="vehicle">Children count:</label>
        <div class="field-agileinfo-spc form-w3-agile-text22">
            <select class="form-control">
               <option value="">Children(2-11 Yrs)</option>
               <option value="1">1</option>
               <option value="2">2</option>
               <option value="3">3</option>
               <option value="4">4</option>
               <option value="5">5+</option>
            </select>
         </div>

         <label for="vehicle">Infant count:</label>
         <div class="field-agileinfo-spc form-w3-agile-text33">
            <select class="form-control">
               <option value="">Infant(under 2Yrs)</option>
               <option value="1">1</option>
               <option value="2">2</option>
               <option value="3">3</option>
               <option value="4">4</option>
               <option value="5">5+</option>
            </select>
         </div>



        <label for="pickupDate">Pickup Date:</label>
        <input type="date" id="pickupDate" name="pickupDate" required/>

        
        <button type="submit">Submit Booking</button>
    </form>
   </form>
</body>
   
 </div>

    )
}

export default Book;