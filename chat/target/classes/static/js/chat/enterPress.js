function enterPress(e){ //传入 event
    var e = e || window.event;
    if(e.keyCode === 13){
        document.getElementById("send-btn").click();
    }
}