
    // Initialize and add the map
    function initMap() {

    var icon = {
    url: "https://img.icons8.com/flat-round/64/000000/tree.png", // url
    scaledSize: new google.maps.Size(15, 15), // scaled size
    origin: new google.maps.Point(0,0), // origin
    anchor: new google.maps.Point(0, 0) // anchor
};

    // The location of Uluru
    const uluru = { lat: -37.8078, lng: 144.9502 };
    // The map, centered at Uluru
    const map = new google.maps.Map(document.getElementById("map"), {
    zoom: 16,
    center: uluru,
    mapTypeControl: true,

});

    // // The marker, positioned at Uluru
    // const marker = new google.maps.Marker({
    //     position: uluru,
    //     map: map
    // });

    // Retrieve our data and plot it
    $.getJSON("https://data.melbourne.vic.gov.au/resource/fp38-wiyy.json", function(data, textstatus) {
    $.each(data, function(i, entry) {

    const contentString =
    '<div id="content">' +
    '<div id="siteNotice">' +
    "</div>" +
    '<h5 id="firstHeading" class="firstHeading">Green area</h5>' +
    '<div id="bodyContent">' +
    "<p><b>The Common name:&nbsp</b>" + entry.common_name + "</p>" +
    "<p><b>Planted years:&nbsp</b>" + entry.year_planted + "</p>" +
    "<p><b>Green area type:&nbsp</b>" + entry.located_in + "</p>" +
    "</div>" +
    "</div>";

    const infowindow = new google.maps.InfoWindow({
    content: contentString,});

    var marker = new google.maps.Marker({
    position: new google.maps.LatLng(entry.latitude,
    entry.longitude),
    map: map,
    icon: icon,
});

    marker.addListener("click", () => {
    infowindow.open(map, marker);
});

});
});
}