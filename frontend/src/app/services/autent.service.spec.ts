import { TestBed } from '@angular/core/testing';

import { AutentService } from './autent.service';

describe('AuthService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AutentService = TestBed.get(AutentService);
    expect(service).toBeTruthy();
  });
});
