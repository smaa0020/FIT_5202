
// Initialize and add the map
function initMap() {

    var icon = {
        url: "https://img.icons8.com/bubbles/100/000000/lake.png", // url
        scaledSize: new google.maps.Size(50, 50), // scaled size
        origin: new google.maps.Point(0,0), // origin
        anchor: new google.maps.Point(0, 0) // anchor
    };

    // The location of Uluru
    const uluru = { lat: -37.834460, lng: 144.939250 };
    // The map, centered at Uluru
    const map = new google.maps.Map(document.getElementById("map"), {
        zoom: 14,
        center: uluru,
        mapTypeControl: true,

    });

    function waterArea(name,latitude,longitude,intro)
    {
        this.name=name;
        this.latitude=latitude;
        this.longitude=longitude;
        this.intro=intro;
    }

    var waterAreas = new Array();
    const waterArea1 = new waterArea("Albert Park Lake", "-37.8443", "144.9688", "It is located in the City of Port Philip within 3 kms south of Melbourne CBD. Can be easily accessed by public transport.");
    const waterArea2 = new waterArea("Ornamental Lake", "-37.829", "144.9817", "Located in the Royal Botanical garden in Melbourne. People can enjoy daily boat rides in this lake from 10:30 am to 5pm.");
    const waterArea3 = new waterArea("Central Lake", "-37.83", "144.9805", "Central lake is also located in the Royal botanical garden. It is smaller than the Ornamental lake.");
    const waterArea4 = new waterArea("Nymphaea Lily Lake", "-37.8326", "144.9809", "Nymphaea Lily Lake also located in the Royal botanical garden is ideal for garden events like weddings with beautiful flower gardens surrounding it.");
    const waterArea5 = new waterArea("West Gate Lakes", "-37.8311", "144.8984", "Located on the eastern banks of the Yarra river, it is famous for its seasonal pink lake.");
    const waterArea6 = new waterArea("Yarra river", "-37.8189", "144.9264", "The perenial Yarra river has been the major water, food and meeting source for Indegenious Australians for a long time. It is 242km in length.");
    const waterArea7 = new waterArea("Maribyrnong river", "-37.8106", "144.906", "Located in the north western suburbs of Melbourne, it is a perenial river of the Port Philip catchement.");
    const waterArea8 = new waterArea("Moonee Ponds Creek", "-37.8106", "144.9347", "The Moonee Ponds Creek is a creek and major tributary of the Yarra River running through urban Melbourne.");
    waterAreas.push(waterArea1);
    waterAreas.push(waterArea2);
    waterAreas.push(waterArea3);
    waterAreas.push(waterArea4);
    waterAreas.push(waterArea5);
    waterAreas.push(waterArea6);
    waterAreas.push(waterArea7);
    waterAreas.push(waterArea8);

    for(let i =0; i < 9; i++){
        const contentString =
        '<div id="content">' +
        '<div id="siteNotice">' +
        "</div>" +
        '<h5 id="firstHeading" class="firstHeading">Water area</h5>' +
        '<div id="bodyContent">' +
        "<p><b>The Common name:&nbsp</b>" + waterAreas[i].name + "</p>" +
        "<p><b>Introduction:&nbsp</b>" + waterAreas[i].intro + "</p>" +
        "</div>" +
        "</div>";

        const infowindow = new google.maps.InfoWindow({
            content: contentString,
        });

        // The marker, positioned at Uluru
        const marker = new google.maps.Marker({
            position: new google.maps.LatLng(+(waterAreas[i].latitude),+(waterAreas[i].longitude)),
            map: map,
            icon: icon,
        });

        marker.addListener("click", () => {
            infowindow.open(map, marker);
        });
    }

}

