function send(){
    let text = document.querySelector('#textarea').value;
    if(!text){
        alert('请输入内容');
        return ;
    }
    let item = document.createElement('div');
    item.className = 'item item-right';
    item.innerHTML = `<div class="bubble bubble-left">${text}</div><div class="avatar"><img src="https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2344525795,3025498146&fm=26&gp=0.jpg" /></div>`;
    document.querySelector('.content').appendChild(item);
    document.querySelector('#textarea').value = '';
    document.querySelector('#textarea').focus();
    //滚动条置底
    let height = document.querySelector('.content').scrollHeight;
    document.querySelector(".content").scrollTop = height;
    $.ajax({
        type:"POST",
        data:{"question":text},
        url:"/deal",
        dataType:"text",
        success:function (resp) {
            let item = document.createElement('div');
            item.className = 'item item-left';
            // item.innerHTML = ` <div class="avatar"><img src="https://dss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=25668084,2889217189&fm=26&gp=0.jpg" /><div class="item item-left"><div class="bubble bubble-left">${resp}</div>`;
            item.innerHTML = `<div class="avatar"><img src="https://ss1.baidu.com/9vo3dSag_xI4khGko9WTAnF6hhy/baike/pic/item/9d82d158ccbf6c8119701e50b63eb13532fa40c6.jpg" /></div><div class="bubble bubble-left">${resp}</div>`;
            document.querySelector('.content').appendChild(item);
            document.querySelector('#textarea').value = '';
            document.querySelector('#textarea').focus();
            let height = document.querySelector('.content').scrollHeight;
            document.querySelector(".content").scrollTop = height;
        },
        error(resp){
            console.log("defeat");
        }
    });
}