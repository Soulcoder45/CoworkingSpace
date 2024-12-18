// Simulated room availability for demo purposes
const availableDates = {
    '2024-12-01': ['Room A', 'Room C'],
    '2024-12-02': ['Room A'],
    '2024-12-03': ['Room B', 'Room C'],
    // Add more dates for the full month...
    '2024-12-28': ['Room A'],
    '2024-12-29': ['Room B'],
    '2024-12-30': ['Room C'],
    '2024-12-31': ['Room A', 'Room B', 'Room C'],
};

// Function to generate the calendar for the next 30 days
function generateCalendar() {
    const calendarDiv = document.getElementById('calendar');
    const currentDate = new Date();

    for (let i = 0; i < 30; i++) { // Loop for 30 days
        const day = new Date(currentDate.getTime() + i * 24 * 60 * 60 * 1000); // Create next 30 days
        const dayStr = day.toISOString().split('T')[0]; // Format to YYYY-MM-DD
        const dayElement = document.createElement('div');
        
        // Check if date is available and set background color
        if (availableDates[dayStr]) {
            dayElement.innerHTML = `
                <strong>${day.toDateString()}</strong><br>
                Habitaciones disponibles: ${availableDates[dayStr].join(', ')}
            `;
            dayElement.style.backgroundColor = '#4CAF50'; // Available rooms (green)
        } else {
            dayElement.innerHTML = `
                <strong>${day.toDateString()}</strong><br>
                Completo
            `;
            dayElement.style.backgroundColor = '#f44336'; // Fully booked (red)
        }

        dayElement.style.color = 'white';
        dayElement.style.padding = '10px';
        dayElement.style.borderRadius = '5px';
        calendarDiv.appendChild(dayElement);
    }
}

// Initialize the calendar on page load
generateCalendar();
// Function to open the "My Reservations" modal
document.getElementById('myReservationsBtn').addEventListener('click', function() {
    document.getElementById('myReservationsModal').style.display = 'block';
});

// Function to close the modal when the user clicks the close button
document.querySelector('.close').addEventListener('click', function() {
    document.getElementById('myReservationsModal').style.display = 'none';
});

// Close the modal if the user clicks outside of the modal content
window.onclick = function(event) {
    const modal = document.getElementById('myReservationsModal');
    if (event.target === modal) {
        modal.style.display = 'none';
    }
};

