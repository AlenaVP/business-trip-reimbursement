const allowance = document.querySelector('#allowance');
const allowanceRateValue = document.querySelector('.allowance-value');
allowanceRateValue.textContent = allowance.value;
allowance.addEventListener('input', allowanceHandler);

function allowanceHandler(event) {
  allowanceRateValue.textContent = event.target.value;
}

const mileage = document.querySelector('#mileage');
const mileageRateValue = document.querySelector('.mileage-value');
mileageRateValue.textContent = mileage.value;
mileage.addEventListener('input', mileageHandler);

function mileageHandler(event) {
  mileageRateValue.textContent = event.target.value;
}
