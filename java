const liste = document.getElementById('monails-list');
const items = Array.from(liste.getElementsByTagName('li'));

let currentIndex = 0;

function showNextItem() {
    // Denis Listenelemente ausblenden
    items.forEach(item => {
        item.classList.remove('show');
        item.style.transition = 'all 2.5s ease-in-out'; // Denis Animation bei jedem Element
    });

    // Nächste Element nächste Element
    items[currentIndex].classList.add('show');

    // Index für nächste Element
    currentIndex = (currentIndex + 1) % items.length;
}

// Initiale Anzeigen 2 Sekunden wechseln
showNextItem();
setInterval(showNextItem, 14000);  
