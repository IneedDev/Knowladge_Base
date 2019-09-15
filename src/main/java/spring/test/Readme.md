
## Mock testing

- assertEquals(expected, actual)
- assertArrayEquals(expected, actual)

Mock.verify - verify if mock method was called with specific passed parameters
Mock.spy - create real object where we can add element and change size

Mockito.doReturn (no data type checking) vs Mockito.thanReturn (data type chacking)

///

- When/Then: when(yourMethod()).thenReturn(5);

- Given/Will: given(yourMethod()).willThrow(OutOfMemoryException.class);

- Do/When: doReturn(7).when(yourMock.fizzBuzz());

- Will/Given/Do: willReturn(any()).given(yourMethod()).doNothing();

- Verify/Do: verify(yourMethod()).doThrow(SomeException.class);

## Setup expectations
when(object.method()).thenReturn(value);
when(object.method()).thenThrow(exception);
doThrow(exception).when(object.voidMethod());


## verify things
verify(object, times(2)).method();
verify(object, times(1)).voidMethod();
