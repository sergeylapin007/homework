Feature:User is able to see the total price of the products on the Checkout page

  @regression
  Scenario: Check that the prices on the checkout page are the same as on the product detail page
    Given open the page by the link "https://allo.ua/ru/"
    When enter "iphone 12" text in the Search field
    And click on the Search button
    And wait for 3 seconds
    And click on the first product on the product listing page
    And wait for 3 seconds
    And click on the Add to basket button
    And wait for 3 seconds
    And click on the Create order button
    And wait for 3 seconds
    And enter "test" text in the Name field
    And enter "0994701818" text in the Phone field
    And enter "testggggrgrgrgrgr@test.com" text in the Email field
    And find the the following city "Харьков" in the City dropdown
    And click on the Select delivery option button
    Then product price is equal to "32 499 ₴"
    And total price is equal to "32 499 ₴"