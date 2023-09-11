function redirectToEmployeeLogin() {
    window.location.href = "../html/employeeLogin.html"; 
}

function redirectToCustomerLogin() {
    window.location.href = "../html/customerLogin.html"; 
}

function redirectToImport() {
    window.location.href = "../html/import.html"; 
}

function redirectToCustomerManage() {
    window.location.href = "../html/orderManageCustomer.html"; 
}

function redirectToInvoice() {
    window.location.href = "../html/invoice.html"; 
}

function redirectToApproved(){
    window.location.href = "../html/approveAction.html"; 
}

const fileInput = document.getElementById("fileInput");
        const successMessage = document.getElementById("successMessage");

        fileInput.addEventListener("change", () => {
            if (fileInput.files.length > 0) {
                successMessage.style.display = "block";
            }
        });

function redirectToValidation(){
    window.location.href = "../html/validationSuccess.html"; 
}

function showPending() {
    document.getElementById('pendingCards').style.display = 'block';
    document.getElementById('completeCards').style.display = 'none';
}

function showComplete() {
    document.getElementById('pendingCards').style.display = 'none';
    document.getElementById('completeCards').style.display = 'block';
}