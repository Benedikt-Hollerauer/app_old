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

        "a negative CreateItemInput.itemId parameter is passed" should
        {
            "return a Left[List[CreateItemUseCaseError.ItemIdConstructionFailed[IdValueError.IdIsNegative[Long]]]]" in
            {
                `tests if CreateItemUseCase.createValidateSaveGetItemEntity method returns a Left[List[CreateItemUseCaseError.ItemIdConstructionFailed[IdValueError.IdIsNegative[Long]]]] when a negative CreateItemInput.itemId parameter is passed`
            }
        }

        "ItemRepository.saveItemToRepository failed" should
        {
            "return a Left[List[CreateItemUseCaseError.ItemRepositoryMethodCallFailed[ItemRepositoryError.SavingItemToRepositoryFailed]]]" in
            {
                `tests if CreateItemUseCase.createValidateSaveGetItemEntity method returns a Left[List[CreateItemUseCaseError.ItemRepositoryMethodCallFailed[ItemRepositoryError.SavingItemToRepositoryFailed]]] when ItemRepository.saveItemToRepository failed`
            }
        }

        "UserRepository.userIsInRepository failed" should
        {
            "return a Left[List[CreateItemUseCaseError.UserRepositoryMethodCallFailed[UserRepositoryError.CheckIfUserIsInRepositoryFailed]]]" in
            {
                `tests if CreateItemUseCase.createValidateSaveGetItemEntity method returns a Left[List[CreateItemUseCaseError.UserRepositoryMethodCallFailed[UserRepositoryError.CheckIfUserIsInRepositoryFailed]]] when UserRepository.userIsInRepository failed`
            }
        }

        "a to short CreateItemInput.itemTitle parameter is passed and ItemRepository.itemIdIsInRepository failed" should
        {
            "return a Left[List[CreateItemUseCaseError.ItemTitleConstructionFailed[TitleValueError.TitleIsToShort[String]], CreateItemUseCaseError.ItemRepositoryMethodCallFailed[ItemRepositoryError.CheckIfItemIdIsInRepositoryFailed]]]" in
            {
                `tests if CreateItemUseCase.createValidateSaveGetItemEntity method returns a Left[List[CreateItemUseCaseError.ItemTitleConstructionFailed[TitleValueError.TitleIsToShort[String]], CreateItemUseCaseError.ItemRepositoryMethodCallFailed[ItemRepositoryError.CheckIfItemIdIsInRepositoryFailed]]] when a to short CreateItemInput.itemTitle parameter is passed and ItemRepository.itemIdIsInRepository failed`
            }
        }
    }
}