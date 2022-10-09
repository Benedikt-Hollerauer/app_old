package useCaseTestImpl

import test.coreTest.useCaseTest.CreateItemUseCaseTest.*
import org.scalatest.wordspec.AnyWordSpec

class CreateItemUseCaseTestImpl extends AnyWordSpec
{
    "CreateItemUseCase.createValidateSaveGetItemEntity method" when
    {
        "correct parameters are passed" should
        {
            "return a Right[ItemEntity]" in
            {
                `tests if CreateItemUseCase.createValidateSaveGetItemEntity method returns a Right[ItemEntity] when correct parameters are passed`
            }
        }

        "a negative CreateItemInput.itemPrice parameter is passed" should
        {
            "return a Left[List[CreateItemUseCaseError.ItemMoneyConstructionFailed[MoneyValueError.AmountIsZeroOrLess[Double]]]]" in
            {
                `tests if CreateItemUseCase.createValidateSaveGetItemEntity method returns a Left[List[CreateItemUseCaseError.ItemMoneyConstructionFailed[MoneyValueError.AmountIsZeroOrLess[Double]]]] when a negative CreateItemInput.itemPrice parameter is passed`
            }
        }

        "ItemRepository.saveItem failed" should
        {
            "return a Left[List[CreateItemUseCaseError.ItemRepositoryMethodCallFailed[ItemRepositoryError.SaveItemFailed[Throwable]]]]" in
            {
                `tests if CreateItemUseCase.createValidateSaveGetItemEntity method returns a Left[List[CreateItemUseCaseError.ItemRepositoryMethodCallFailed[ItemRepositoryError.SaveItemFailed[Throwable]]]] when ItemRepository.saveItem failed`
            }
        }

        "UserRepository.findUserById failed" should
        {
            "return a Left[List[CreateItemUseCaseError.UserRepositoryMethodCallFailed[UserRepositoryError.FindUserByIdFailed[Throwable]]]]" in
            {
                `tests if CreateItemUseCase.createValidateSaveGetItemEntity method returns a Left[List[CreateItemUseCaseError.UserRepositoryMethodCallFailed[UserRepositoryError.FindUserByIdFailed[Throwable]]]] when UserRepository.findUserById failed`
            }
        }

        "a to short CreateItemInput.itemTitle parameter is passed and ItemRepository.doesItemIdExist failed" should
        {
            "return a Left[List[CreateItemUseCaseError.ItemTitleConstructionFailed[TitleValueError.TitleIsToShort[String]], CreateItemUseCaseError.ItemRepositoryMethodCallFailed[ItemRepositoryError.DoesItemIdExistFailed[Throwable]]]]" in
            {
                `tests if CreateItemUseCase.createValidateSaveGetItemEntity method returns a Left[List[CreateItemUseCaseError.ItemTitleConstructionFailed[TitleValueError.TitleIsToShort[String]], CreateItemUseCaseError.ItemRepositoryMethodCallFailed[ItemRepositoryError.DoesItemIdExistFailed[Throwable]]]] when a to short CreateItemInput.itemTitle parameter is passed and ItemRepository.doesItemIdExist failed`
            }
        }
    }
}