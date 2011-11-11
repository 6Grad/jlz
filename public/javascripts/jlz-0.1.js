(function (w) {
  
  /*our name in global namespace*/
  w.jlz = this;
  
  
  /*public stuff*/
  this.open_link = function (url) {
    window.open(url);
  }
  
  this.switchTab = function (el) {
    var tabEl = $(el);
   
    $('.tab',tabEl.parent()).each(function (index) {
      $(this).removeClass('active');
    });
    
    tabEl.addClass('active');
    
  }
  
}(window));