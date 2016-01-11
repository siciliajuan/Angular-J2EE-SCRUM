describe('Angular Rocks tests E2E', function() {

  it('helloTest', function() {
  	browser.get('http://localhost/#/support');
    expect(browser.getTitle()).toEqual('Clients Report');
  });

});