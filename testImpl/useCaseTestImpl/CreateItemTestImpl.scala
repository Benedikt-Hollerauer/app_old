package useCaseTestImpl

import test.coreTest.useCaseTest.CreateItemUseCaseTest.*
import org.scalatest.wordspec.AnyWordSpec

class CreateItemTestImpl extends AnyWordSpec
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

        "a negative CreateItemInput.userId parameter is passed" should
        {
            "return a Left[List[IdValueError.IdIsNegative]]" in
            {
                `tests if CreateItemUseCase.createValidateSaveGetItemEntity method returns a Left[List[IdValueError.IdIsNegative]] when a negative CreateItemInput.userId parameter is passed`
            }
        }

        "ItemRepository.saveItemToRepository failed" should
        {
            "return a Left[List[ItemRepositoryError.SaveItemToRepositoryMethodCallFailed]]" in
            {
                `tests if CreateItemUseCase.createValidateSaveGetItemEntity method returns a Left[List[ItemRepositoryError.SaveItemToRepositoryMethodCallFailed]] when ItemRepository.saveItemToRepository failed`
            }
        }

        "UserRepository.userIdIsInRepository failed" should
        {
            "return a Left[List[UserRepositoryError.UserIdIsInRepositoryMethodCallFailed]]" in
            {
                `tests if CreateItemUseCase.createValidateSaveGetItemEntity method returns a Left[List[UserRepositoryError.UserIdIsInRepositoryMethodCallFailed]] when UserRepository.userIdIsInRepository failed`
            }
        }

        "a to short CreateItemInput.itemTitle parameter is passed and ItemRepository.itemIdIsInRepository failed" should
        {
            "return a Left[List[TitleValueError.TitleIsToShort, ItemRepositoryError.ItemIdIsInRepositoryMethodCallFailed]]" in
            {
                `tests if CreateItemUseCase.createValidateSaveGetItemEntity method returns a Left[List[TitleValueError.TitleIsToShort, ItemRepositoryError.ItemIdIsInRepositoryMethodCallFailed]] when a to short CreateItemInput.itemTitle parameter is passed and ItemRepository.itemIdIsInRepository failed`
            }
        }
    }
}