// REDIRECTS TO EMPLOYEE LOGIN PAGE
function redirectToEmployeeLogin() {
    window.location.href = "../html/employeeLogin.html"; 
}

// REDIRECTS TO CUSTOMER LOGIN PAGE
function redirectToCustomerLogin() {
    window.location.href = "../html/customerLogin.html"; 
}

// REDIRECTS TO IMPORT QUOTES PAGE
function redirectToImport() {
    window.location.href = "../html/import.html"; 
}

// REDIRECTS TO ORDER MANAGEMENT CUSTOMER PAGE
function redirectToCustomerManage() {
    window.location.href = "../html/orderManageCustomer.html"; 
}

// REDIRECTS TO INVOICE PAGE
function redirectToInvoice() {
    window.location.href = "../html/invoice.html"; 
}

//TO DISPLAY ALERT MESSAGE ON SUCCESSFUL VALIDATION OF JSON/XML FILE
function quoteCreated(){
    alert("Quote Created Successfully!")
}

// REDIRECTS TO CREATE NEW QUOTE PAGE
function redirectToCreateNewQuote() {
    window.location.href = "../html/createNewQuote.html"; 
}

//TO CONVERT PENDING ORDERS TO APPROVED
function redirectToApproved(){
    window.location.href = "../html/approveAction.html"; 
}

// XML/JSON FILE VALIDATION
const fileInput = document.getElementById("fileInput");
        const successMessage = document.getElementById("successMessage");

        fileInput.addEventListener("change", () => {
            if (fileInput.files.length > 0) {
                successMessage.style.display = "block";
            }
        });

// REDIRECTS TO SUCCESSFUL VALIDATION PAGE
function redirectToValidation(){
    window.location.href = "../html/validationSuccess.html"; 
}

// TO SHOW PENDING REQUESTS
function showPending() {
    document.getElementById('pendingCards').style.display = 'block';
    document.getElementById('completeCards').style.display = 'none';
}

// TO SHOW COMPLETE REQUESTS
function showComplete() {
    document.getElementById('pendingCards').style.display = 'none';
    document.getElementById('completeCards').style.display = 'block';
}