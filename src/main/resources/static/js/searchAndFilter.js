// 得到主题ul"search-box对象
const ul = document.getElementById("authors");

function createNode(element) {
    return document.createElement(element);
}

function append(parent, el) {
    return parent.appendChild(el);
}

window.onload = fetchData("https://randomuser.me/api/?results=20");
var datum = [];

function fetchData(url) {
    var data = "";
    fetch(url)
        .then((resp) => resp.json())
        .then(function (data) {
            data = displayData(data.results);
            return data;
        })
        .catch(function (error) {
            return data;
        });
}

function displayData(authors) {
    return authors.map(function (author, index) {

        datum.push(author);

        let li = createNode("li"),

            figure = createNode("figure");

        (img = createNode("img")),

            (strong = createNode("strong")),

            (span = createNode("span"));

        address = createNode("address");

        a = createNode("a");

        addBtn = createNode("a");

        img.src = author.picture.medium;

        strong.innerHTML = `${author.name.first} ${author.name.last}`;

        span.innerHTML = `${author.dob.age} ${author.gender}`;

        a.innerHTML = `${author.email}`;

        a.setAttribute("href", `${author.email}`);

        address.innerHTML = `${author.location.city}, ${author.location.state} , ${author.location.country}, ${author.location.postcode} `;



        append(figure, img);
        append(li, figure);
        append(li, strong);
        append(li, span);
        append(li, a);
        append(li, address);
        append(li, addBtn);
        append(ul, li);
    });
}

//将一个object中的属性组合为一个想要的标签。
function prepareList(author) {
    var results = "";
    results = `<li><figure><img src=${author.picture.medium} /></figure>\n
                <strong>${author.name.first} ${author.name.last}</strong>\n
                <span>${author.dob.age}</span>\n
                <span>${author.gender}</span>\n
                <a href= ${author.email}>${author.email}</a>\n
                <address>${author.location.city}, ${author.location.state}, ${author.location.country}, ${author.location.postcode} </address>\n
                \n
                </li>`;
    return results;
}


/*-----------filter----------*/
function filter() {
    const ul = document.getElementById("authors");
    var a = document.getElementById("select");
    var b = a.options[a.selectedIndex].value;
    var items = document.getElementsByName("acs");
    var selectedItems = [];
    for (var i = 0; i < items.length; i++) {
        if (items[i].type == "checkbox" && items[i].checked == true) {
            selectedItems.push(items[i].value);
        }
    }
    var showresults = prepareFilterData(datum, b, selectedItems);
    console.log(showresults);
    showresults ? counterResults(showresults) : null;
}

//将符合条件且重组完毕的标签加入到外部html标签中
function counterResults(showresults) {
    if (showresults["count"] > 0) {
        ul.innerHTML = showresults["results"];
    } else {
        ul.innerHTML = "No results found";
    }
}

function prepareFilterData(datum, b, selectedItems) {
    var results = "";
    var count = 0;
    datum.map(function (author) {
        if (b === author.gender) {
            if (selectedItems.length == 0) {
                count++;
                results += prepareList(author);
            } else {
                for (var i = 0; i < selectedItems.length; i++) {
                    if (author.location.country === selectedItems[i]) {
                        count++;
                        console.log(author.location.country, author.name, i);
                        results += prepareList(author);
                    }
                }
            }
        } else if (b === "all") {
            console.log(b);
            if (selectedItems.length == 0) {
                count++;
                results += prepareList(author);
            }
            for (var i = 0; i < selectedItems.length; i++) {
                if (author.location.country === selectedItems[i]) {
                    count++;
                    results += prepareList(author);
                }
            }
            console.log(results);
        }
    });

    return { count: count, results: results };
}



/*-------searching-------*/
function showResults() {
    //得到html中的ul
    const ul = document.getElementById("authors");

    //return搜索结果
    var showresults = search(authors);

    console.log(showresults);
    showresults ? counterResults(showresults) : null;
}

function search() {
    //结果
    var results = "";

    //计数
    var count = 0;

    //得到搜索栏内容
    var searchText = document.getElementById("search-box").value;

    //前端控制台输出数据信息
    console.log(searchText, datum);
    //数组的map函数，重组数组。
    datum.map(function (author) {
        //author对象的email属性
        var text = author.email;
        //取出整个元素
        var slicedText = text.slice(0, searchText.length);
        if (searchText === slicedText) {
            //计算符合搜索内容的数量
            count++;
            //将符合条件的object重组成html标签并存储
            results += prepareList(author);
        }
    });
    //输出result 和 计数
    console.log(results, count);
    //return count 和 result.
    return { count: count, results: results };
}
